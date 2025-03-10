package com.java.multithreading.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    // Created an object of the lock.
    // We make it final so that noone can make changes to it.
    private final Lock lock = new ReentrantLock();

    // Explicit locks : via manual locking technique
    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                            Thread.currentThread().interrupt();
                        }
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance : " + balance);
                    } catch (Exception e) {
                        System.out.println(e);
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance.");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Couldn't acquired the lock, will try again later.");
            }
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
    }

    // Intrinsic locks : via synchronized.
    // public synchronized void withdraw(int amount) {
    //     System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

    //     if (amount <= balance) {
    //         System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
    //         try {
    //             Thread.sleep(3000);
    //         } catch (InterruptedException e) {
    //             System.out.println(e.getMessage());
    //         }
    //         balance -= amount;
    //         System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance : " + balance);
    //     } else {
    //         System.out.println(Thread.currentThread().getName() + " Insufficient Balance.");
    //     }
    // }
}
