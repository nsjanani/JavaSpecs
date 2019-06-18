package com.java.specs.array;

public class MultiArraySpecs {

    public static void main(String[] args) {

        /**
         * Spec #1 : Different ways of initializing multi-dimensional arrays
         */

        int iaa3[][][] = new int[2][3][3];

        int[][][] iaa;
        iaa = new int[3][2][1];

        int[][][] iaa1 = {
                {
                        {1},
                        {2, 3,},
                        {4, 5, 6}
                },
                {
                        {2,2,2}
                }
        };

        int[][][] iaa2 = new int[1][2][];
        iaa2[0][1] = new int[2]; // [0][2][2]

        int[][][] iaa4;
        iaa4 = new int[1][][];

        iaa4[0] = new int[2][];

        iaa4[0][0] = new int[1];
        iaa4[0][1] = new int[2];

        iaa4[0][0][0] = 3;
        iaa4[0][1][0] = 2;
        iaa4[0][1][1] = 2;
    }
}