package com.java.multithreading.methods;

/*
 * Methods of thread :
 * 1. start() - for starting out the execution of a thread in java.
 * 2. run() - The entire code which you have to run in a new thread is here in the run method.
 * 3. sleep() - This method sleeps out the Thread for a particular period of time that you've been specify there.
 * 4. join() - The thread which is calling this method waits for the thread to compelete its task after that it will
 *          continue its execution.
 * 5. setPriority() - If we have more than one thread and we have to set a priority that which will you have to do first we can
 *          this using the setPriority() method.
 * 6. getPriority() - For getting the priority of the thread.
 * 7. interrupt() - Like if our thread is sleeping or doing something then when we call this method it will stops the execution 
 *          by calling the interrupt method it will interrupt the thread execution and throw out an interrupted exception.
 * 8. yield() - This method tells the current thread to wait and give a chance to another thread for their execution.
 * 9. setDaemon() - This method tells that the thread is a background thread we don't have to wait for it when the main thread execution
 *          is stopped we'll stop this thread execution too.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException{
        // Start join and run example
        // MyThread myThread = new MyThread("aditya-thread"); // This will create out the new thread.
        // myThread.start(); // The start method runs the execution of the new thread.
        // myThread.join(); // This method stops the current execution of the main thread and tells him to wait for the thread before it completes it execution.
        // System.out.println("Hello world");

        // Priority example
        // MyThread l = new MyThread("Low priority thread");
        // MyThread m = new MyThread("Medium priority thread");
        // MyThread h = new MyThread("High priority thread");
        // l.setPriority(Thread.MIN_PRIORITY);
        // m.setPriority(Thread.NORM_PRIORITY);
        // h.setPriority(Thread.MAX_PRIORITY);
        // l.start();
        // m.start();
        // h.start();

        // Interrupt example
        // MyThread t1 = new MyThread();
        // t1.start();
        // t1.interrupt();

        // Yield example
        // MyThread t1 = new MyThread("chintu");
        // MyThread t2= new MyThread("mintu");
        // t1.start();
        // t2.start();

        // DAEMON THREADS : Daemon threads are the background threads.
        // Let us taken an example that we are doing too expensive work with a thread so the jvm waits even after
        // the main thread execution is done so when the expensive-work done then the jvm stops.
        // But we we create that thread as a daemon then we are telling the jvm that it is background thread you dont have to
        // wait for the thread.

        MyThread myNewThread = new MyThread();
        myNewThread.setDaemon(true);
        myNewThread.start();
        System.out.println("Main completed");
    }
}