package com.java.finalThings.Class;

// Final classes in java.
/*
 * Let us understand the scenerio that there is a car company which wants that they don't produce evcar
 * cause they are being luxirious in their genre so they declare themselves as final so that noone can inherit them.
 */

final class LuxuryCar {
    LuxuryCar() {
        System.out.println("We are luxury car brand.");
    }
}

// class EvCar extends LuxuryCar {} // This will produce an error that we cannot subclass this class from a final class.

public class Main {
    public static void main(String[] args) {
        LuxuryCar lc = new LuxuryCar();
    }
}
