package com.java.specs.array;

class ArrayInitialisation {

    public static void main(String[] args) {

        /**
         * Spec #1: Different ways of array initialization
         */
        int[] arr1 = {3, 4, 3};
        int arr2[] = {44, 23};

        int[] arr7 = new int[10];
        for (int i = 0; i < arr7.length; i++)
            arr7[i] = i;

        int[] arr8 = new int[3];
        arr8[0] = 3;
        arr8[1] = 3;
        arr8[2] = 3;

        int[] arr10 = new int[]{3, 4, 3, 3};

        int[] arr12;
        arr12 = new int[]{4, 4, 4,};

        Thing[] things = new Thing[]{new Thing(), new Thing(3)};

        StringBuilder[] sba = new StringBuilder[] {new StringBuilder("Hello1"), new StringBuilder("Hello2")};

        /**
         * Spec #2: Trailing commas are accepted
         */
        int[] arr3 = {3, 4, 4, 4,};

        /**
         * Spec #3: Invalid array initialisation
         */
        int[] arr4 = new int[3];
        arr4 = new int[]{3, 4, 4, 3, 4,};
        System.out.println("Redundant Array Length " + arr4.length); // Array length given at first line is redundant and not accepted

        int[] arr5 = new int[3];
//        arr5 = {3,4,4,4};

        int[] arr6;
//        arr6 = new int[4]{3,3,3,3};

        int[] arr9 = new int[3];
//        arr9[10] = 3;  // IndexOutOfBoundsException will be thrown at runtime

//        int[] arr11 = new int[]{3,4,,3,3};

        /**
         * Spec #4: Array values initialized with null or 0, based on reference or primitive type respectively
         */
        int[] arr13 = new int[3];
        System.out.println("Primitive Array Initialised Values");
        for(int i:arr13)
            System.out.print(i+ " ");
        System.out.println();

        Thing[] things1 = new Thing[2];
        System.out.println("Object Array Initialised Values");
        for(Thing thing: things1)
            System.out.print(thing + " ");
        System.out.println();

        /**
         * Spec #5: Passing array to method calls
         */
        System.out.println("Passing int array to method calls");
        intArrayMethod(arr1);
        intArrayMethod(new int[]{3,3,3,});
        intArrayMethod(new int[]{3,3,3,22});
//        intArrayMethod({3,3,3}); //invalid

        System.out.println("Passing object array to method calls");
        thingArrayMethod(new Thing[]{new Thing()});
        thingArrayMethod(things);
        thingArrayMethod1(new Thing[3]);
//        thingArrayMethod(new Thing[3]); // nullPointerException
//        thingArrayMethod(new Thing[3]{new Thing(), new Thing(), new Thing()}); //invalid

        /**
         * Spec #6: Null values allowed in initialisation
         */
        Thing[] things2 = new Thing[] {null, new Thing()};
    }

    static void intArrayMethod(int[] arr) {
        for(int i:arr)
            System.out.print(i + " ");
        System.out.println();
    }

    static void thingArrayMethod(Thing[] things) {
        for(Thing thing: things)
            System.out.print(thing.identity + " ");
        System.out.println();
    }

    static void thingArrayMethod1(Thing[] things) {
        for(Thing thing: things)
            System.out.print(thing + " ");
        System.out.println();
    }
}

class Thing {
    int identity;

    Thing() {
        this.identity = 0;
    }

    Thing(int identity) {
        this.identity = identity;
    }
}
