package com.java.specs.operators;

public class ShiftOperators {

    public static void main(String[] args) {
        /**
         * Spec #1: >> (Signed Right Shift)
         * 1010 --> 0101
         */
        System.out.println(10 >> 1); // results to 5
        System.out.println(-10 >> 1); // results to -5

        /**
         * Spec #2: >>> (Unsigned Right Shift)
         * Example 1:
         * int representation of 10 in 32 bits --> 0000 0000 0000 0000 0000 0000 0000 1010
         * int representation of -10 (two's complement form) in 32 bits --> 1111 1111 1111 1111 1111 1111 1111 0101 + 1 --> 1111 1111 1111 1111 1111 1111 1111 0110
         * Shifting the above representation by 1 bit to the right --> 0111 1111 1111 1111 1111 1111 1111 1011 == 2147483643
         *
         * Example 2:
         * int representation of 1 in 32 bits --> 0000 0000 0000 0000 0000 0000 0000 0001
         * int representation of -1 (two's complement form) in 32 bits --> 1111 1111 1111 1111 1111 1111 1111 1110 + 1 --> 1111 1111 1111 1111 1111 1111 1111 1111
         * Shifting the above representation by 1 bit to the right --> 0111 1111 1111 1111 1111 1111 1111 1111 == 2147483647
         */
        System.out.println((-10) >>>  1);
        System.out.println((-1) >>>  1);

        /**
         * Spec #3: >> (Left Shift)
         * 0000 0000 0000 0000 0000 0000 0000 1010 --> 0000 0000 0000 0000 0000 0000 0001 0100
         */
        System.out.println(10 << 1); // results to 20

        /**
         * Spec #4: There is nothing called Signed/Unsigned Left Shift, as they both are identical
         */
//        System.out.println(10 <<< 1); // Compiler error <<< - no such operator
    }

}
