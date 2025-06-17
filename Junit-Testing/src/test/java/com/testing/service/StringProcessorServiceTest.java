package com.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// Similar to SpringBootApplication annotation this annotation too enables some auto-configuration.
@SpringBootTest
public class StringProcessorServiceTest {

    // The class who we are testing, so we have to acquire the object of that class.
    // Since the class is a Service class we can get the beam from the spring container.
    @Autowired
    private StringProcessorService stringProcessorService;

    // The Test function name should convey what the test do.
    // Function name: testIsPalindrome_WithValidPalindrome()
    // It tests the String is palindrome or not or we are passing a valid palindrome.
    // For Making it as a Test we need to annotate it with the @Test annotation.
    @Test
    public void testIsPalindrome_WithValidPalindrome() {
        var result = stringProcessorService.isPalindrome("MALAYALAM");
        // Assertions class has many static methods.
        // In the current scenario we are expecting a True result from the function.
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPalindrome_WithInvalidPalindrome() {
        var result = stringProcessorService.isPalindrome("ADITYA");
        // We are expecting the False result.
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPalindrome_WithNull() {
        // var result = stringProcessorService.isPalindrome(null); // Here we get a Null Pointer Exception.
        // Assertions.assertFalse(result);
        // Right now we are not doing the test driven development.
        // So making the test behavior such like the function behavior.
        Assertions.assertThrows(NullPointerException.class, () -> {
            stringProcessorService.isPalindrome(null);
        });
    }

}

// Have a look at these too:
// If you are doing test driven development then it's OK to change the development code as per your test.
// But If you are restricted to change the code then your test must be according to the behavior of the function.