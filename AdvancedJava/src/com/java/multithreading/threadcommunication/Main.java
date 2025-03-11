package com.java.multithreading.threadcommunication;

/*
 * Thread communication is crucial for saving out the CPU Resources from wastage cause if we don't use thread communication
 * in the below example the consumer thread keep on checking that the data is produced or not but in this condition when the data exits we tells
 * the consumer thread to consume it and when the data is been consumed we tell the producer thread to produce new data.
 * 
 * Some method which are useful : These methods are used in synchronized context.
 * wait() - for waiting out the one thread
 * notify() - for notify the other thread.
 * notifyAll() - If we have more than one consumers we can use this.
 */

class SharedResource {
    private int data;
    private boolean hasData = false;
    
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed : " + data);
        hasData = false;
        notify();
        return data;
    }
}

class Producer implements Runnable {

    private SharedResource sharedResource;

    Producer (SharedResource sr) {
        sharedResource = sr;
    }

    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            sharedResource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    
    private SharedResource sharedResource;

    Consumer(SharedResource sr) {
        sharedResource = sr;
    }

    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            sharedResource.consume();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        SharedResource sr = new SharedResource();

        Thread producerThread = new Thread(new Producer(sr));
        Thread consumerThread = new Thread(new Consumer(sr));

        producerThread.start();
        consumerThread.start();
    }
}
