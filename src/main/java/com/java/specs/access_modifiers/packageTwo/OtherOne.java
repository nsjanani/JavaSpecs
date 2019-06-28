package com.java.specs.access_modifiers.packageTwo;

import com.java.specs.access_modifiers.packageOne.One;

public class OtherOne {

    /**
     * Variables with protected and default access in a class in one package are not in a class in another package, having no relationship
     */
    public void methodOtherOne() {
        One one = new One();
//        System.out.println(one.defaultX);
//        System.out.println(one.protectedY);
    }

}