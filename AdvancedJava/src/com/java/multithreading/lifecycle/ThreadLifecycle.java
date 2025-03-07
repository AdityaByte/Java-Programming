package com.java.multithreading.lifecycle;

/*
 * The following are the states in which the Java Thread moves during it execution.
 * 1. NEW - When the thread is being newly created and we didn't invoke out the start method.
 * 2. RUNNABLE - When we invoke out the start method then the java thread is in the Runnable state.
 * 3. RUNNING - In java there is no state as RUNNING but we assume that the runnable state is refer for the thread 
 * is begin to start the execution or the thread is been executing.
 * 4. WAITING/BLOCKED - In this state the thread is waiting to perform a task.
 * 5. TERMINATED - When the thread finished all its execution then it gets terminated.
 */

public class ThreadLifecycle extends Thread{

    @Override
    public void run() {
        try{
            System.out.println("RUNNING");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        ThreadLifecycle t1 = new ThreadLifecycle();
        System.out.println(t1.getState()); // NEW State
        t1.start();
        System.out.println(t1.getState()); // Now the thread is in the RUNNABLE State
        Thread.sleep(100);
        System.out.println(t1.getState()); // Now the thread is in the TIMED_WAITING state.
        t1.join();
        System.out.println(t1.getState()); // Now the thread gets TERMINATED
    }
}
