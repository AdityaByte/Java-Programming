package com.stripe.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// This DTO is sent as a json body with the POST request to the Stripe API.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequest {
    private String name;
    private Long amount;
    private Long quantity;
    private String currency;
}
