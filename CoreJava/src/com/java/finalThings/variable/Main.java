package com.java.finalThings.variable;

// Final Variable - Final variables are constant so we cannot reassign the value of the final variable.
// Once they are declared we cannot change their value by reassign some other value to it.

class Example {
    private static final double PI = 3.14; // Final variables are declared in upper case cause they are constants.

    public static final String name;

    static {
        name = "aditya pawar"; // We can initialize them in a static block too.
    }

    public final String data;

    // We can also initialize them to constructor too.

    Example() {
        data = "I dont know";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Example.name);
        // For accessing out the data constant we have to create an instance of it.
        Example ex = new Example();
        System.out.println(ex.data);
    }
}
