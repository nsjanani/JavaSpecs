package com.java.specs.operators;

public class PromotingOperands {

    public static void main(String[] args) {
        short s = 10;
        int i = 22;
        long l = 34;
        float f = 22F;
        double d = 12D;

        /**
         * Spec #1: If either of the operand is double, the result is promoted to double
         */
//    int r1 = d + s; // Compiler error
        double r1 = d + s;
        System.out.println(r1);

        /**
         * Spec #2: Else If either of the operand is float, the result is promoted to float
         */
//    int r2 = f + s; // Compiler error
        float r2 = f + s;
        System.out.println(r2);

        /**
         * Spec #3: Else If either of the operand is long, the result is promoted to long
         */
        //    int r3 = l + s; // Compiler error
        long r3 = l + s;
        System.out.println(r3);

        /**
         * Spec #4: Else If either of the operand is int, the result is promoted to int
         */
        //    int r4 = i + s; // Compiler error
        int r4 = i + s;
        System.out.println(r4);

        /**
         * Spec #5: The original values is not affected by this promotion
         * s is copied to intermediate workspace and promoted and hence the original value is not affected
         * This is similar to pass by value
         */
        int r5 = i + s;
        System.out.println(r5);
    }
}