package com.java.specs.access_modifiers.packageTwo;

import com.java.specs.access_modifiers.packageOne.One;

public class OtherTwo extends One {

    /**
     * Variables with protected access in a class in one package is visible in a friendly class
     * Variables with default access in a class is not visible in a class in another package
     */
    public void methodOtherTwo() {
        One one = new One();
//        System.out.println(one.defaultX);
        System.out.println(protectedY);
    }

}