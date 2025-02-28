package com.java.finalThings.method;

// We can also apply final keywords to the methods 
// let us taken an example that we have two classes one is the vehicle class and one is the ev car class
// so the scenerio is that the for cost cutting ev car is willing to reduce the air bags so we declare the final method so it can't override it.

class Vehicle {
    public final void airBags() {
        System.out.println("We provide 4 air bags for safety.");
    }
}

class EvCar extends Vehicle {
    // Here we can't override the method which was present in the parent class cause it is final.
}

public class Main {
    public static void main(String[] args) {
        EvCar evCar = new EvCar();
        evCar.airBags();
    }
}
