package com.java.enums;

/*
 * Enums simply stands for enumeration.
 * -> Enums can hold up a list of constants which are public static final variables.
 * -> These constants are the instance of the class enum.
 * -> Enums are converted to the class at compile time.
 * -> They gets converted to the class so we can write fields and methods inside that just after the declaration of the constants.
 * -> When its gets converted to the class at compile time then the fields are converted to the string with indexing number by its constructor.
 */

public enum Day {

    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THRUSDAY("thrusday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    public String field = "Aditya Pawar";

    // We can create out a constructor.
    private Day(String lower) {
        this.field = lower;
    }

    public String getLower() {
        return this.field;
    }

}
