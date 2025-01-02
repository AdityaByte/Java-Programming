package com.java.basics.operators;

// Relational operators are helpful in decison making when we have to make a relation.
// They return a boolean statement after their execution.
// These operators are mainly used in decison making statements.
/*
Types of relational operator -
1. Greater than : >
2. Less than : <
3. Greater than or equal to : >=
4. Less than or equal to : <=
5. Comparison operator : ==
6. Not equal to : !=
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int a = 90;
        int b = 70;
        System.out.println(a > b); // Returns true
        System.out.println(a < b); // Return false
        System.out.println(a >= b); // Returns true
        System.out.println(a <= 90); // Return true
        System.out.println(a == b); // Returns false
        System.out.println(a != b); // Returns true
    }
}
