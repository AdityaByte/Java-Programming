package com.java.exceptionHandling.uncheckedException;

/*
 * Unchecked Exceptions : The exceptions which are not checked by compile time are known as unchecked exceptions.
 * These can be simply handle by the try-catch block.
 */

public class Main {
    public static void main(String[] args) {
        // Making the object of the student class and initializing it to null and performing some operations.
        try{
            Student student = null;
            student.demo(); // This will throw out an error but it does not checked at compile time.
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    public void demo() {

    }
}
