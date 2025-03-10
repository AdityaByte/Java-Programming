package com.java.multithreading.locks;

/* Why we are using the explicit locks --->
 * Problem with the synchronized keyword :
 * -> When we use that then when one thread is using the shared resource another 
 * can't access it so if one thread takes too much time while processing out the data till then
 * the other thread waits so that's why we use the explicit locks.
 * 
 * Manual locks : 
 * Lock is an interface whom we have to create the object using the 
 * implementation class.
 * It has some methods like -
 * 1. lock() 2. trylock() 3. unlock() etc
 * 
 * 1. trylock() method - If the lock is available then it will returns true and we can work with the 
 * critical section if one thread is accessing the shared resource then the lock is not avaiable at that time
 * then in this situation it return false and in this case the other thread don't need to wait for the other thread.
 * 
 * 2. trylock(time) method - In this method we specify a time that wait for that time if the lock is avaiable then you 
 * can work after that otherwise it will don't wait.
 * 
 * 3. unlock() - This method is crucial for unlocking out the resources. Kept this method in the finally block.
 * 
 * 4. lock() - It is similar to the synchorized when one thread locks a resource then
 * the other thread waits till the lock() is not unlocked.
 * 
 * Note - When dealing with lock make ensure you interrupt the thread in the catch section.
 */


public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
