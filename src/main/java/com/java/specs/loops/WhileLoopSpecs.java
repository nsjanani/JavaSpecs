package com.java.specs.loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileLoopSpecs {

    public static void main(String[] args) {

        /**
         * While loop with iterator
         */
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("blah blah");
        list.add("bye");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
