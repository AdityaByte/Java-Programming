package com.java.controlflow.conditional;

// If the if statement does not runs then this else if statement runs but we have to specify a condition with it means
// If this not then this and if also this not then else block.
// Syntax:
/*
if (condition){
// Body
}
else if (condition){
// Body
}
else{
// Body
}
 */
public class ElseIfCondition {
    public static void main(String[] args) {
        int a = 0;
        int b = -1;
        if (b > a){
            System.out.println("b is greater than a");
        }
        else if(b < a){
            System.out.println("b is smaller than a");
        }
        else{
            System.out.println("b is equal to a");
        }

        // Here in the above case it checks first for the if case since it returns false so it does not execute then it came to the
        // else if block and now this condition returns true so the else if block runs means if the if block runs then it does not go the
        // else if block and program ends there.
    }
}
