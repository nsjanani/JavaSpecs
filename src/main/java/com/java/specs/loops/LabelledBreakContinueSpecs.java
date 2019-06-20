package com.java.specs.loops;

public class LabelledBreakContinueSpecs {

    public static void main(String[] args) {
        /**
         * Spec #1 : Labelled break
         * Example - Find all the treasures in the below block, where treasure == 100
         * 100 2 3 3
         * 3 3 100 4
         * 3 100 3 4
         * 3 6 3 100
         */
        System.out.println("Spec #1: Labelled break******************");
        int[][] iaa = {
                {100, 2, 3, 3,},
                {3, 100, 3, 4,},
                {3, 3, 100, 4,},
                {3, 6, 3, 100}};
        outerblock:
        {
            for (int k = 0; k < iaa.length; k++) {
                System.out.println("Outer block " + k);
                int i = 0;
                innerblock:
                {

                    while (i < iaa[k].length) {
                        if (iaa[k][i] == 100) {
                            System.out.println("Treasure found in the inner block at index " + k);
                            break innerblock;
                        }
                        i++;
                    }

                }
                System.out.println("Inner block executed till " + i);
            }
        }

        /**
         * Spec #2 : Labelled continue
         * Example - Find all the treasures in the below block, where treasure == 100
         * 100 2 3 3
         * 3 3 100 4
         * 3 100 3 4
         * 3 6 3 100
         */
        System.out.println("Spec #2: Labelled continue******************");
        int[][] iaa1 = {
                {100, 2, 3, 3,},
                {3, 3, 100, 4,},
                {3, 100, 3, 4,},
                {3, 6, 3, 100}};
        outerblock:
        for (int k = 0; k < iaa1.length; k++) {
            System.out.println("Outer block " + k);
            int i = 0;
            innerblock:
            while (i < iaa1[k].length) {
                if (iaa1[k][i] == 100) {
                    System.out.println("Treasure found in the inner block at index " + k);
                    continue outerblock;
                }
                i++;
            }
            System.out.println("Inner block executed till " + i); // This statement never gets printed as continue skips the below part of the loop and jumps straight into the loop start
        }


        /**
         * Spec #3 : Labelled continue can be used only with loops - for, do while & while
         * Labelled continue can be used almost anywhere - Example - other than loops -  switch, if conditional
         * Example - Find all the treasures in the below block, where treasure == 100
         * 100 2 3 3
         * 3 3 100 4
         * 3 100 3 4
         * 3 6 3 100
         */
        System.out.println("Spec #3: Labelled continue can only be used with loops******************");
        int[][] iaa2 = {
                {100, 2, 3, 3,},
                {3, 3, 100, 4,},
                {3, 100, 3, 4,},
                {3, 6, 3, 100}};
        outerblock:
        {
            for (int k = 0; k < iaa1.length; k++) {
                System.out.println("Outer block " + k);
                int i = 0;
                innerblock:
                {
                    while (i < iaa1[k].length) {
                        if (iaa1[k][i] == 100) {
                            System.out.println("Treasure found in the inner block at index " + k);
//                            continue outerblock; // Not a loop label - compiler error
                        }
                        i++;
                    }
                    System.out.println("Inner block executed till " + i);
                }
            }
        }
    }
}