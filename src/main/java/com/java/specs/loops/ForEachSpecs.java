package com.java.specs.loops;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ForEachSpecs {

    public static void main(String[] args) {

        /**
         * Spec #1: Anything can be added to raw collection - not type safe - any exception can occur
         */
        ArrayList al = new ArrayList();
        al.add("hello");
        al.add("bye");
        al.add(new Date());

        for(Object object : al) {
            System.out.println(object);
        }

        /**
         * For each loop, with Object for String
         */
        ArrayList<String> alString = new ArrayList();
        alString.add("one");
        alString.add("two");
        alString.add("three");

        for(Object object : alString) {
            System.out.println(object);
        }

        for(String str : alString) {
            System.out.println(str);
        }

    }

}