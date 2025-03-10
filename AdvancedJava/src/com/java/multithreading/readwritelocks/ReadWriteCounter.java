package com.java.multithreading.readwritelocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

    private int count = 0;
    
    // Creating an instance of the ReenterantReadWriteLock.
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    // Now creating seperate instance for the readLock and writeLock
    private final Lock readLock = readWriteLock.readLock();

    private final Lock writeLock = readWriteLock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is writing..");
            count++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

}
