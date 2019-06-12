package com.java.specs.operators;

public class TernaryOperators {

    public static void main(String[] args) {
        Byte b2 = 23;
        byte b = 34;
        byte b1 = 34;
        char c = 123;
        char c1 = 1232;
        short s = 21;
        int i = 12;
        long l = 3422;
        float f = 12323;
        double d = 2321313;
        boolean bo1 = false;
        boolean bo2 = true;

        /**
         * Spec #1: If two operands are of the same type, the resulting type is of the same type
         * It won't force its result to be int or larger.
         */
        byte bresult = (true)? b : b1;
        System.out.println(bresult);

        char cresult = (false)? c : c1;
        System.out.println(cresult);

        /**
         * Spec #2: If the two operands are of different type, then the resulting type is the type of the larger of its two operands
         * Notice that Resulting type is based on the assignment compatibility of both the operands
         * As an example, Boolean and int can't be combined
         */
        long lresult = (true)? b : l;
        System.out.println(lresult);

        float fresult = (false)? f : i;
        System.out.println(fresult);

        double dresult = (true)? b2: d;
        System.out.println(dresult);

        /**
         * Spec #3: It is also possible to get result smaller than int
         * This only works however if the expression type of the other operand is of that smaller type
         */
        byte b1result = (true)? b1 : 10;
        System.out.println(b1result);

        char c1result = (false)? (char)b : c;
        System.out.println(c1result);

        /**
         * Spec #4: The operands doesn't have to be numeric only
         */
        boolean boresult = (false)? bo1 : bo2;
        System.out.println(boresult);
    }
}
