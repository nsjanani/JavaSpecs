package com.java.specs.statics;

public class StaticMaker {

    private static int x = 10;
    private int y = 2;

    public static void main(String[] args) {

        StaticMaker staticMakerInstance = new StaticMaker();
        /**
         * Static/Class Variable can be called either by className or by reference.
         * Though calling by reference is not recommended.
         */
        System.out.printf("Static Variable x %d\n", StaticMaker.x);
        staticMakerInstance.x = 20;
        System.out.printf("Static Variable x %d\n", StaticMaker.x);
        StaticMaker.x = 30;
        System.out.printf("Static Variable x %d\n", StaticMaker.x);

        staticMakerInstance.doStuffY(staticMakerInstance);

        /**
         * Static/Class Methods can be called either by className or by reference.
         * Though calling by reference is not recommended.
         */
        StaticMaker.doStaticStuffX(staticMakerInstance);
//        staticMakerInstance.doStaticStuffX(staticMakerInstance);
//        doStaticStuffX(staticMakerInstance);
    }

    /**
     * Instance Method can call/refer
     * 1. Static/Class variable and instance variable directly
     * 2. Using this
     * 3. Using explicit reference
     */
    public void doStuffY(StaticMaker staticMaker) {
        // Static variable - x
        System.out.println("Static Variable X");
        System.out.printf("I'm an instance do stuffer - x=%d\n", x);    // Calling directly
        System.out.printf("I'm an instance do stuffer - using this - x=%d\n", this.x); // Using this
        System.out.printf("I'm an instance do stuffer - using explicit reference - x=%d\n", staticMaker.x); // Using explicit reference

        // Instance variable - y
        System.out.println("Instance Variable Y");  // Calling directly
        System.out.printf("I'm an instance do stuffer y=%d\n", y);
        System.out.printf("I'm an instance do stuffer - using this - y=%d\n", this.y);  // Using this
        System.out.printf("I'm an instance do stuffer - using explicit reference - y=%d\n", staticMaker.y); // Using explicit reference
    }

    /**
     * Static/Class Method
     * 1. can refer only Static/Class variable directly and not instance variable directly
     * 2. can't refer Static/Class variable or instance variable using this
     * 3. can refer Static/Class variable and instance variable using explicit reference
     */
    public static void doStaticStuffX(StaticMaker staticMaker) {
        // Static variable - x
        System.out.println("Static Variable X");
        System.out.printf("I'm an instance do stuffer - x=%d\n", x);    // Calling directly
//        System.out.printf("I'm an instance do stuffer - using this - x=%d\n", this.x); // Using this
        System.out.printf("I'm an instance do stuffer - using explicit reference - x=%d\n", staticMaker.x); // Using explicit reference

        // Instance variable - y
        System.out.println("Instance Variable Y");
//        System.out.printf("I'm an instance do stuffer y=%d\n", y);    // Calling directly
//        System.out.printf("I'm an instance do stuffer - using this - y=%d\n", this.y);  // Using this
        System.out.printf("I'm an instance do stuffer - using explicit reference - y=%d\n", staticMaker.y); // Using explicit reference
    }

}