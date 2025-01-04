package com.java.controlflow.conditional;

// Here by using the conditional control flow statement we as a programmer makes condition in which condition the program runs or not.
// Here if in hindi means "yadi" - if this condition returns true then we will proceed for this otherwise we'll not.
// Syntax : if(condition) {---body---}
// And we can write multiple if statements in a program and we can also write nested if statement in a program but our code must be optimized.
// The time complexity of the if statement is 0(n) notation cause if statement runs every time if you specify if statement 10 times in your program then the time complexing is 0(10)
public class IfStatement {
    public static void main(String[] args) {

        int a = 10;
        int b = 12;

        if(a < b){ // as we can say this this condition is true so it prints out the below statement.
            System.out.println("a is smaller than b");
        }
        if(a > b){
            System.out.println("a is greater than b"); // Here in the above case a is not greater than b.
        }
        if(a != b){
            System.out.println("a doesn't equals to b"); // This statement also runs cause the condition is true.
        }

    }
}
