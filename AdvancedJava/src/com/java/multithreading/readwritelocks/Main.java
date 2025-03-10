package com.java.multithreading.readwritelocks;

/* Read Write locks : 
 * -> Read write locks allows multiple threads to read resources concurrently as 
 * long as no thread is writing to it.
 * -> It ensures exclusive access to write operation.
 */

public class Main {
    public static void main(String[] args) {
        ReadWriteCounter rwCounter = new ReadWriteCounter();
 
        // We are creating out two classes (anonymous) one for the read operation and other for write operation.

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    rwCounter.increment();
                }
            };
        };

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    int count = rwCounter.getCount();
                    System.out.println(Thread.currentThread().getName() + " is reading count: " + count);
                }
            }
        };

        // I am assigning two threads for reading and one for writing
        Thread writeThread = new Thread(writeTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        try {
            writeThread.join();
            readThread1.join();
            readThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }

        System.out.println("All task done...");
    }
}
