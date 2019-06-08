package com.java.specs;

public class Operators {

    public static void main(String[] args) {

        /* Rule #1: byte, short and char produce only int results
         * And hence the result can't be assigned to an short, byte or char and only to an int
         */
        short s = 1;
        byte b = 1;
//        s = s + b; // gives compiler error
        int result = s + b;
        System.out.println("Rule #1 - short and byte produces int " + result);

        /*
         * Spec #2: Evaluation of an expression is always from left to right
         */
        System.out.println("Rule #2 - Evaluation of an expression is always from left to right: Example 1");
        int[] x = {0, 1, 2, 3, 4};
        int idx = 0;
        x[++idx] = x[idx] + 1000; // increment the index idx to 1 and then x[1] = x[1] + 1000 --> x[1] = 1 + 1000 = 1001
        for(int v : x) {
            System.out.println(v);
        }

        System.out.println("Rule #2 - Evaluation of an expression is always from left to right: Example 2");
        int[] x1 = {0, 1, 2, 3, 4};
        int idx1 = 0;
        x1[idx1++] = x1[idx1] + 1000; // make x1[idx1] referred as x1[0] and then increment the index idx1 to 1, so it got evaluated to x1[0]=x1[1]+1000 --> x1[0] = 1 + 1000 = 1001
        for(int v : x) {
            System.out.println(v);
        }

    }
}
