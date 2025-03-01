package com.java.exceptionHandling.customException;

public class BankAccount {
    
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception{
        if(amount > balance) {
            throw new InsufficientBalanceException(this.balance);
        } 
        balance -= amount;
    }

}
