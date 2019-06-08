package com.java.specs.operators;

public class BitWiseOperators {

    public static void main(String[] args) {
        /**
         * Spec #1: & (AND) - Operates on a binary operator
         *  1010
         *  0101
         * ------
         *  0000
         * ------
         */
        int a = 10;
        int b = 5;
        System.out.println(a & b); // results to 0

        /**
         * Spec #2: | (OR)
         *  1010
         *  0101
         * ------
         *  1111
         * ------
         */
        System.out.println(a | b); // results to 15

        /**
         * Spec #3: ^ (XOR) - Operates on a binary operator
         *  1010
         *  0101
         * ------
         *  1111
         * ------
         */
        System.out.println(a ^ b); // results to 15

        /**
         * Spec #4: ~ (Complement) - Operates on a unary operator
         * ~(1010) = 0101 ==> Decimal 5
         * Representation of 0101 in two's complement form
         * 1010
         *    1
         * -----
         * 1011  --> -11
         * -----
         * Note: Two's complement form --> Complement the binary representation and add 1
         */
        System.out.println(~a); // results to -11
    }
}
