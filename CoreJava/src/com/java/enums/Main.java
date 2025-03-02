package com.java.enums;

/*
 * Enums : Enum simply means enumeration.
 * Enumeration means listing things.
 * For example : Listing no of months in a year, listing no of days in a week etc.
 * If a String is used many times then we declare it as a constant.
 */

public class Main {

    // enums are by default static.
    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGEST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }

    public static void main(String[] args) {
        // System.out.println(DayClass.MONDAY); // Now we can use them like this
        // System.out.println(DayClass.TUESDAY);

        // Here we can use it via enum.
        // System.out.println(Day.MONDAY);

        Day day = Day.MONDAY; // As you can see this is the instance of the class Day so we can write it as Student student = new Student();
        System.out.println(day.name()); // This method returns the string of the constant.
        System.out.println(day.toString()); // This do the same.
        System.out.println(day.ordinal()); // It gives the index no here monday is at 1 so it gives 1.
        // Autounboxing the day object.
        Day newDay = day.valueOf("MONDAY"); // It compares the constant with that we have the constant like this or not so in this way if 
        // it doesn't match then it will throw out an error.

        Day wed = Day.WEDNESDAY;
        String lowerCaseDay = wed.getLower();
        System.out.println(lowerCaseDay);

        // These enums are being useful like we have a scenerio that we want to enumerate over and prints out months via switch case.
        Months month = Months.DECEMBER;

        String result = switch(month) {
            case JANUARY -> "The month is january"; // Here these are returning out the values.
            case FEBRUARY -> "The month is febrary";
            default -> "I dont know about this month";
        };

        System.out.println(result);
    }
}