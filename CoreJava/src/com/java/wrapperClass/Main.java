package com.java.wrapperClass;

public class Main {
    public static void main(String[] args) {
        // Java is not a purely object oriented programming language 
        // If everything in a language is an object then we can call it as the purely oop language.
        int a = 1;
        // a. // has no methods
        Integer a1 = 1; // Autoboxing: Making a primitive datatype to an object .
        // It is similar to.
        Integer aa1 = Integer.valueOf(1); // The above syntax is the short form for this.

        // AutoUnboxing : It is technique of converting the object to a primitive datatype.
        int aaa1 = aa1;
        // The above syntax is similar to this.
        int aaaa1 = Integer.valueOf(aaa1);

        // Other primitive datatypes too have the wrapper classes like

        Byte b1 = 127;

        Short s1 = 123;

        Long l1 = 1243l;

        Float f1 = 12.9f;

        Double d1 = 123.12d;

        Boolean bool1 = true;

        Character c1 = 'c';

        // Some of the methods that come along with this.

        Integer objectNum = 9;
        System.out.println(objectNum.toBinaryString(objectNum));

    }
}
