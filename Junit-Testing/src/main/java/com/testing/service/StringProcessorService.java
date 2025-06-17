package com.testing.service;

import org.springframework.stereotype.Service;

@Service
public class StringProcessorService {

    public boolean isPalindrome(String str) {
        String reverseString = new StringBuilder(str).reverse().toString();
        return str.equals(reverseString);
    }

}
