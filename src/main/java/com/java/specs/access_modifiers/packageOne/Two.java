package com.java.specs.access_modifiers.packageOne;

public class Two {

    /**
     * Variables with protected and default access are visible in any class inside the package
     */
    public void methodTwo() {
        One one = new One();
        System.out.println(one.defaultX);
        System.out.println(one.protectedY);
    }

}