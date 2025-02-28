package com.java.OOPs.interfaces;

/*
 * Interfaces in java - 
 * - Interfaces are also the blueprint for class that can only contain abstract methods (before java 8). Now
 *  they can contain static and default methods (after java 8).
 * - It is used for acheiving full abstraction and multiple inheritance.
 * - The class which implements the interface can implement more than one interface at a time.
 * - Interfaces can extend themselves.
 * - Variables inside them are public, static and final variables.
 * - All the methods inside them are public by default.
 * - Default methods are only allowed in interface.
 * - They don't have constructor.
 * - In Java, all methods inside an interface are implicitly public and abstract, 
 *      so you do not need to use the abstract keyword explicitly.
 * - We can achieve multiple inheritance with the help of interface in java.
 * - Use Case : Best used when enforcing a contract for multiple unrelated classes.
 * - Syntax : interface InterfaceName and the class which implements it Syntax: class ClassName implements InterfaceName
 */

interface Vehicle {
    // This is public and abstract by default 
    void start();

    void accelerate(int speed);
    
    void stop();
}

class Car implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    
    @Override
    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Bike is accelerating to " + speed + " km/h.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.accelerate(60);
        car.stop();
        System.out.println();
        Vehicle bike = new Bike();
        bike.start();
        bike.accelerate(40);
        bike.stop();
    }
}