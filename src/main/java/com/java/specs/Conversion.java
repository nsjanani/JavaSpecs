package com.java.specs;

public class Conversion {

    public static void main(String[] args) {
        /* Spec #1: Widening (Converting a primitive to higher order primitive)
         * Though wrapper class (Short) of primitive (short) does exist, preference is given for widening
         */
        short x = 2;
        Spec1.method(x); // --> Output : "Inside int primitive"

       /* Spec #2: Boxing (Converting a primitive to its corresponding reference wrapper)
        * As no high order primitive found, preference is given to Wrapper class
        */
        short x1 = 3;
        Spec2.method(x1);

        /* Spec #3: Var-args
         * As no high order primitive and wrapper class found, preference is given to var-args
         */
        short x2 = 4;
        Spec3.method(x2);
    }
}

class Spec1 {

    public static void method(short... s) {
        System.out.println("Inside Short var-args");
    }

    public static void method(Short s) {
        System.out.println("Inside Short Wrapper");
    }

    public static void method(int i) {
        System.out.println("Inside int primitive");
    }

    public static void method(Integer i) {
        System.out.println("Inside Integer Wrapper");
    }
}

class Spec2 {
    public static void method(Short s) {
        System.out.println("Inside Short Wrapper");
    }

    public static void method(short... s) {
        System.out.println("Inside Short var-args");
    }
}

class Spec3 {
    public static void method(short... s) {
        System.out.println("Inside Short var-args");
    }
}
