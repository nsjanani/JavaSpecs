package com.java.specs;

public class DeclarationOrder {

    public void setName(String name) {
        /**
         * Spec #1: Order in which a constructor, methods and variables are defined inside a class doesn't matter at all
         * variable 'name' is used before its declaration inside a class --> Order doesn't matter
         */
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String name;

    public DeclarationOrder() {

    }

    public void testOrder() {
        /**
         * Spec #2: Order in which variables are defined does matter inside a method
         * variable 'i' can't be used before declaring it inside a method   --> Order does matter
         */
//        i = 99;
//        int i;
    }
}
