package com.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import java.time.Year;

// First Thing:
// Have to annotate the Test class with @SpringBootTest.
@SpringBootTest
public class DiscountServiceTest {

    // Now have to create the object of the actual class.
    @SpyBean
    private DiscountService discountService;

    @Test
    public void testCalculateDiscount_WithValidPromoCode() {
        var discount = discountService.calculateDiscount(10, "ADITYA");
        // When the promoCode is valid and its ADITYA we get the 10 percent discount.
        Assertions.assertEquals(1f, discount); // Argument order: expected value - actual value.
    }

    @Test
    public void testCalculateDiscount_WithInvalidPromoCode() {
        var discount = discountService.calculateDiscount(20, "HELLO");
        // We are expecting 0 discount cause PromoCode is invalid.
        Assertions.assertEquals(0f, discount);
    }

    // In the below test we know about the SpyBean and about Mocking a test.
    @Test
    public void testCalculateDiscount_WithValidPromoCodeFor2025() {
        // But in the service function we are fetching out the current year by the system time.
        // But if the tester runs this test after a year then the test would fail.
        // Because the function rely on the thing which may change after time.
        // In that case we can mock the bean.
        Mockito.when(discountService.getCurrentYear()).thenReturn(Year.of(2025));
        var discount = discountService.calculateDiscount(20, "DIWALI");
        // So we get a discount of 5 rupees.
        Assertions.assertEquals(5f, discount);
    }

    @Test
    public void testCalculateDiscount_WithValidPromoCodeFor2024() {
        Mockito.when(discountService.getCurrentYear()).thenReturn(Year.of(2024));
        var discount = discountService.calculateDiscount(10, "DIWALI");
        // 0% discount.
        Assertions.assertEquals(0, discount);
    }

    @Test
    public void testCalculateDiscount_WithNullPromoCode() {
        var discount = discountService.calculateDiscount(10, null);
        Assertions.assertEquals(0, discount);
    }

}
