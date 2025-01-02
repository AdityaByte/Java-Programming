package com.java.basics.operators;

/*
There is often confusion when it comes to hybrid equations which are equations having multiple operators.
The problem is which part to solve first. There is a golden rule to follow in these situations.
If the operators have different precedence, solve the higher precedence first. If they have the same precedence,
solve according to associativity, that is, either from right to left or from left to right.
 */
public class PrecedenceAndAssociativity {
    public static void main(String[] args) {
        int a = 10 + 23 * 4 % 5 / 12;

        /*
        step 1 : here we evaluate firstly according to precedence * has the largest precedence of 12 and / and %
            have also the same (12) so we go for associativity left to right.

        Step 2 : then + and - has precedence of 11 then we have to solve that

        Step 3 : Solving out the expression
        23 * 4 = 92 % 2 = 2 / 12 = 0 => 10 + 0 = 10
         */

        System.out.println(a); // Output is 10.
    }
}
