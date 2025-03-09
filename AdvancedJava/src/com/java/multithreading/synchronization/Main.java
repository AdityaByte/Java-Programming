package com.java.multithreading.synchronization;

/*
 * Problem that occur before synchronization :
 * -> Since many threads are working simutaneously and we have given a shared resource to them
 * then it might have a situation that both the threads will perform the same operation at same time and
 * this situation is known as the race condition in multithreading.
 * -> To overcome this issue we have to synchronized the operation that are using the shared resource
 * this can be done by making the method synchronized and by using the synchronized block.
 */

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            // We are waiting for the threads to complete because if we don't do that then the main thread proceed and these will runs seperately.
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(counter.getCount());
    }
}