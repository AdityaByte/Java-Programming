package com.java.controlflow.iterative;

// Iterative control flow also refers to looping statements.

// If we want to iterate a task multiple times, we use looping statements.
// If we know the number of iterations beforehand, we typically use a for loop.
// Syntax:
/*
for (initialization expression; test expression; Update expression){
    // Body
}
 */

/*
Java for loop is divided into 3 major parts :
1. Initialization Expression : Initializes the loop variable. This is executed once at the start of the loop.
2. Test Expression : Tests the loop condition. If true, the loop body is executed; otherwise, the loop terminates.
3. Update Expression : After executing the loop body, this expression increments/decrements the loop variable by some value.
 */
public class ForLoop {
    public static void main(String[] args) {
        // 1. Simple for loop - counting from 1 to 10, For loop with increment.
        System.out.println("Counting from 1 to 10");
        for(int i=0; i<10; i++){
            System.out.println("Number : " + (i+1));
        }

        // 2. For loop with decrement
        System.out.println("Counting down from 10 to 1");
        for(int i=10; i>0; i--){
            System.out.println("Number : " + i);
        }

        // 3. Looping through an array
        System.out.println("Looping through an array");
        String[] arr = {"aditya","abhi","adi"};  // array of string of length 3
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d : %s\n",(i+1), arr[i]);
        }

        // 4. Infinite For Loop with break statement
        System.out.println("Infinite for loop without a condition");
        for(int i=1; /* Haven't we specify the condition */ ; i++){
            if(i == 4){
                System.out.println("Value is 4 breaking out from loop");
                break;
            }
            System.out.println("Value of i : " + i);
        }
    }
}

