package com.java.OOPs.abstraction;

/**
 * Abstraction : It can be refer as hiding inner implementation and showing the particular one which is being 
 * useful for the real world scenerio like if we have taken the example in a car there is an accelarator,brake and 
 * clutch we use them directly without knowing the inner implementation how the gear box and the engine works with the
 * help of this is abstraction.
 * Here we more learn about abstract class concept too.
 */

 // This is the in general thing that ever car should have

 abstract class Car {

    protected static int SPEED = 0;

    abstract void speedUp();
    abstract void applyBrake();
    abstract void pressClutch();
 }

// This is the inner implementation of the car of type hyundai.
 class Hyundai extends Car {

    @Override
    public void speedUp() {
        SPEED += 10;
        System.out.println("Speeding up the car....");
    }

    @Override
    public void applyBrake() {
        if (SPEED != 0)
        SPEED -= 5;
        System.out.println("Applying brake to the car...");
    }

    @Override
    public void pressClutch() {
        System.out.println("Now the car is free...");
    }
 }

 public class AbstractionExample {
    public static void main(String[] args) {
        // Here we are creating a reference of the Car and creating the object of the Hyundai car ok...
        Car car = new Hyundai();
        car.speedUp();
        car.applyBrake();
        car.pressClutch();
    }
 }