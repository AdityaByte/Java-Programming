package com.stripe.payment.controller;

import com.stripe.payment.dto.ProductRequest;
import com.stripe.payment.dto.StripeResponse;
import com.stripe.payment.service.StripeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/v1")
@RequiredArgsConstructor
public class ProductCheckoutController {

    private final StripeService service;

    @PostMapping("/checkout")
    public ResponseEntity<StripeResponse> checkoutProducts(@RequestBody ProductRequest productRequest) {
        StripeResponse response = service.checkoutProducts(productRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}
