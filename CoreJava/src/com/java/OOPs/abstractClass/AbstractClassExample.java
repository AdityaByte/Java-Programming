package com.java.OOPs.abstractClass;

import java.util.List;

/*
 * Abstract Class :
 * - Abstract class is the blueprint for other classes.
 * - An Abstract class can contain abstract methods as well as concerte methods too.
 * - The class which inherit from the abstract class must override all the abstract methods.
 * - We cannot instantiate an abstract class in java.
 * - `abstract` keyword is used for creating an abstract class in java.
 * - We can create anonymous inner class for providing implementation for abstract methods.
 * - Abstract class can contain constructor.
 * - The instance variable can be of any access modifiers (public, protected and private)
 * - Use Case : Best use when classes share common behavior with some method implementation.
 */

abstract class Phone {

    protected long modelNo;
    protected String modelName;
    protected String color;

    // Can have constructor 
    Phone() {
        System.out.println("This is the Phone");
    }

    protected void call() {
        System.out.println("Calling...");
    }

    static void switchOff() {
        System.out.println("Switching off the phone");
    }
    // Abstract method..
    abstract protected void feature();
    
    abstract public void showInformation();
}

class SmartPhone extends Phone {

    List<String> features = List.of("Gaming", "Multitasking", "screentouch");

    @Override
    protected void feature() {
        System.out.println("Features are " + features);
    }

    @Override
    public void showInformation() {
        this.modelNo = 12345l;
        this.modelName = "Red magic 23";
        this.color = "Crimson";

        System.out.printf("Model No : %d\nModel Name :%s\nColor : %s\n", modelNo, modelName, color);
    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        Phone newPhone = new SmartPhone();
        newPhone.call();
        newPhone.feature();
        newPhone.showInformation();
        Phone.switchOff(); // Static method can be accessed direclty without creating an instance.
    }
}