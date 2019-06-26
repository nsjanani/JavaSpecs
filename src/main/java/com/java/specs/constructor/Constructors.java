package com.java.specs.constructor;

public class Constructors {

    /**
     * We can declare a method same name as the class name but it will be very confusing
     */
    public void Constructors() {
        System.out.println("I'm a method name which is same as the class name");
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        constructors.Constructors();
    }
}
