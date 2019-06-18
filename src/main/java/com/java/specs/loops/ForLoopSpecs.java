package com.java.specs.loops;

import java.util.Date;

public class ForLoopSpecs {

    public static void main(String[] args) {
        /**
         * Spec #1: Multiple declaration allowed in initialization part
         */
        for(int i = 0, j = 0; i<0 && j <0; i++) {

        }

        /**
         * Spec #2: Multiple expression allowed in initialization part
         */
        int i=0;
        for(new Date(), Math.random(); new Date().toString().equals("hello"); i++) {
            System.out.println("Never printed");
        }

        /**
         * Spec #3: Declaration and expression can't be combined in initialization part
         */
//        for(int k=0,new Date(); true; i++) {
//
//        }

        /**
         * Spec #4: Multiple expression allowed in increment part
         */
        for(int j=0; true; new Date(), Math.random()) {

        }
    }

}