package com.java.exceptionHandling.customException;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(10);
            account.withdraw(100);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
