package com.java.exceptionHandling.customException;

// Here if we want to create a custom exception firstly we have to inherit that class from the exception class.
public class InsufficientBalanceException extends Exception{

    private double amount;
    
    InsufficientBalanceException(double amount) {
        super("Insufficient balance dude what are you doing.");
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

}
