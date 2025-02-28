package com.java.OOPs.accessSpecifier;

// Access specifiers define the level of access for properties and methods, determining where they can be accessed within a program.
// Here we have a public class which can be accessed everywhere inside and outside the package.
// The method inside it is static so that the JVM does not need to create an object of the class for accessing it.
// There are four access specifiers in Java:
/**
 * 1. Private: Private members can only be accessed within a class, unless we define a getter or setter to access them.
 * 2. Protected: Protected members can be accessed within the same class, same package, or in subclasses in a different package (via inheritance only).
 * 3. Public: Public members can be accessed everywhere in the same class, package, and different packages.
 * 4. Default (No access specifier specified): Members are package-private and can only be accessed within the same package.
 */

// Example of access specifiers in Java.

class DemoClass {
    String name; // Default
    private int id; // Private
    protected String address; // Protected
    public float percentage; // Public

    // All members can be accessed within the same class.
    void demoMethod() {
        id = 1212; // Private access is allowed here.
    }
}

class ChildClass {
    DemoClass dc = new DemoClass();

    void childMethod() {
        dc.percentage = 100.0f; // Public member can be accessed anywhere.
        dc.address = "Norway"; // Protected member can be accessed in the same package.
        // dc.id = 1212; // Error: Private members cannot be accessed here.
        dc.name = "Aditya"; // Default member can be accessed within the same package.
    }
}

public class Main {
    public static void main(String[] args) {
        DemoClass demo = new DemoClass();
        demo.percentage = 95.5f; // Public
        demo.name = "John"; // Default (same package)

        // demo.address = "Norway"; // Error if in a different package.
        // demo.id = 1212; // Private members cannot be accessed.
    }
}
