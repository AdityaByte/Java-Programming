package com.java.OOPs.polymorphism.dynamicPolymorphism.overriding;

/*
 * Dynamic Polymorphism : Polymorphism simply refers to one entity many forms.
 * In Dynamic Polymorphism or run time polymorphism the compiler decide which version of the program or method is being 
 * executed at runtime rather than at compile time.
 * 
 * Here we are learning about method overriding 
 * Overriding can be achieved in inheritance the method of same signature exists in the Super class and in the Sub class
 * then the compiler decide at runtime which version of method is being called at runtime.
 * 
 * Note : In Java Objects are created dynamically using the new keyword it has no static object creation in the stack memory.
 */

// let we take an example of cars that we have a car and we have some other cars too.

class Car {
    protected int topSpeed = 200;
    
    public void getTopSpeed() {
        System.out.printf("Top speed of car is %d \n", topSpeed);
    }
}

class BuggatiChiron extends Car {

    // Updating the topSpeed variable 
    BuggatiChiron() {
        this.topSpeed = 460;
    }

    @Override // If the method is overriden then this Tag doesnot give error.
    public void getTopSpeed() {
        System.out.printf("Top speed of buggati chiron is %d \n", topSpeed);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // If you created the object of the Car class then the method is called of the Car class.
        Car car = new Car();
        BuggatiChiron buggatiChiron = new BuggatiChiron();
        car.getTopSpeed(); // Prints the speed of the car
        buggatiChiron.getTopSpeed(); // Prints the speed of the car despite at compile time the method call is resolve at runtime.
    }
}