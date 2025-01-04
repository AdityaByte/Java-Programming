package com.java.controlflow.iterative;

// Do-while loop - Unlike for loops and while loops, the do-while loop executes the body of the loop at least once
// before checking the condition. The condition is then evaluated, and if true, the loop repeats.
// Syntax:
/*
do {
    // Loop body (statements to execute)
    // Update expression (optional)
} while (Condition);
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        // Simple do while loop
        int i = 4;
        System.out.println("Simple Do While loop : ");
        do{
            System.out.println("Java is the best"); // Here this statement run one time since the condition is false.
        }while(i > 4);

        // 2. Increment do while loop
        System.out.println("Increment do while loop");
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=5);

        // Note : If you can't handle it properly then as a result it be a infinite loop.
    }
}
