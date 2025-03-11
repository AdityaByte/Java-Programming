package com.java.multithreading.deadlocks;

/*
 * Note : When a method uses the synchronized keyword it will acquire the intrinsic lock of the object the method
 * belongs to.
 * 
 * To resolve deadlock : 
 * -> You must ensure that every thread will acquire the lock in a consistent order.
 */

class Pen {

    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }

}

class Paper {

    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + pen);
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }

}

class Task1 implements Runnable {

    private Pen pen;
    private Paper paper;

    Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // Thread-1 locks pen and tries to lock paper.
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        // Here we are implementing the lock to paper and then acquiring the pen's lock
        // To resolve deadlock locks must be in the same order.
        synchronized (pen) {
            paper.writeWithPaperAndPen(pen); // Thread2 locks paper and tries to lock pen.
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread t2 = new Thread(new Task2(pen, paper), "Thread-2");

        t1.start();
        t2.start();
    }
}
