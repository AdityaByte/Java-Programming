/**
 * Encapsulation: Encapsulation can be referred to as binding the attributes and methods inside a container called a class.
 * In Encapsulation, we keep the data members private so that no other elements can access them directly.
 * They can only be accessed through the class's methods.
 */

 package com.java.OOPs.encapsulation;

 // As you can see here, some fields which are crucial, such as the owner name and balance, are kept private.
 // Only the methods inside the class can manipulate these fields.
 
 class BankAccount {
     private static final String IFSC_CODE = "BANK001INDIA";
     private long balance;
     private String ownerName;
 
     // Constructor to initialize values dynamically
     public BankAccount(String ownerName, long balance) {
         this.ownerName = ownerName;
         this.balance = balance;
     }
 
     public long getBalance() {
         return this.balance;
     }
 
     public String getOwnerName() {
         return this.ownerName;
     }
 
     public static String getIFSCCode() {
         return IFSC_CODE;
     }
 }
 
 public class EncapsulationExample {
     public static void main(String[] args) {
         BankAccount account = new BankAccount("Aditya Pawar", 100000);
         System.out.println("Balance: " + account.getBalance());
         System.out.println("Owner Name: " + account.getOwnerName());
         System.out.println("IFSC Code: " + BankAccount.getIFSCCode());
     }
 }
 