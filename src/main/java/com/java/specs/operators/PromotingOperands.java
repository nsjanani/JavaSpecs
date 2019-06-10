package com.java.specs.operators;

public class PromotingOperands {

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

    /**
     * Spec #2: Else If either of the operand is float, the result is promoted to float
     */
//    int r2 = f + s; // Compiler error
    float r2 = f + s;

    /**
     * Spec #3: Else If either of the operand is long, the result is promoted to long
     */
    //    int r3 = l + s; // Compiler error
    float r3 = l + s;

    /**
     * Spec #4: Else If either of the operand is int, the result is promoted to int
     */
    //    int r4 = i + s; // Compiler error
    float r4 = i + s;
}