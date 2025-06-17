package com.testing.service;

import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class DiscountService {

    public float calculateDiscount(float amount, String promoCode) {
        if (promoCode == null) {
            return 0;
        } else if (promoCode.equals("ADITYA")) {
            return amount * 0.1f; // 10% discount.
        } else if (promoCode.equals("DIWALI") && getCurrentYear().getValue() == 2025 ) {
            return amount * 0.25f; // 25% discount.
        }

        return 0;
    }

    Year getCurrentYear() {
        return Year.now();
    }

}
