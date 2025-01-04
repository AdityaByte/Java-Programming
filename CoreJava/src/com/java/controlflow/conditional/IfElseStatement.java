package com.java.controlflow.conditional;

// If else condition in java
// Syntax :
/*
if (condition) {
// If statement body
}
else {
// Else statement body
}
 */
// Here in the if else statement if the condition returns false in the if statement then the if statement doesn't execute so in that case
// Else statement execute.
// Else is the last statement or condition if all the condition that specified above fails then this runs otherwise it will not.
public class IfElseStatement {

    public static void main(String[] args) {

        boolean condition1 = 14 > 34; // as we all know this condition returns false

        if(condition1){
            System.out.println("Condition returns true");
        }
        else{
            System.out.println("Condition returns false"); // This statement prints out in this case.
        }


    }

}
