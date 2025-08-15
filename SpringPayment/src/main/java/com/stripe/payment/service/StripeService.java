package com.stripe.payment.service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.payment.dto.ProductRequest;
import com.stripe.payment.dto.StripeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StripeService {

    @Value("${stripe.secretKey}")
    private String SECRET_KEY;

    // For Connecting with the stripe we need an API-Key
    // Input: productName, amount, quantity, currency - we have to give these inputs with the stripe api
    // Response: SessionId and URL(used to complete the payment).
    // Note: for stripe the amount will be in the smallest currency unit like for rupee it is paisa for dollar it is cent.

    public StripeResponse checkoutProducts(ProductRequest productRequest) {
        Stripe.apiKey = SECRET_KEY;

        // We have to specify these things these are given by the Stripe API
        SessionCreateParams.LineItem.PriceData.ProductData productData = SessionCreateParams.LineItem.PriceData.ProductData.builder()
                .setName(productRequest.getName())
                .build();
        SessionCreateParams.LineItem.PriceData priceData = SessionCreateParams.LineItem.PriceData.builder()
                .setUnitAmount(productRequest.getAmount())
                .setCurrency(productRequest.getCurrency() != null ? productRequest.getCurrency() : "INR")
                .setProductData(productData)
                .build();
        SessionCreateParams.LineItem lineItem = SessionCreateParams.LineItem.builder()
                .setQuantity(productRequest.getQuantity())
                .setPriceData(priceData)
                .build();

        // Now we have to set these parameters to the session, we have to create the session.
        SessionCreateParams params = SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setSuccessUrl("http://localhost:8080/api/product/success")
                .setCancelUrl("http://localhost:8080/api/product/cancel")
                .addLineItem(lineItem)
                .build();

        Session session = null;

        try {
            session = Session.create(params);
        } catch (StripeException e) {
            log.error(e.getMessage());
        }

        if (session == null) {
            return StripeResponse
                    .builder()
                    .status("FAILURE")
                    .message("Session creation failed without exception")
                    .build();
        }

        return StripeResponse
                .builder()
                .status("SUCCESS")
                .message("Payment session created")
                .sessionId(session.getId())
                .sessionUrl(session.getUrl())
                .build();
    }

}
