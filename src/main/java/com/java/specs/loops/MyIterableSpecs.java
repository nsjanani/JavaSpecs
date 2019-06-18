package com.java.specs.loops;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Spec #1: For each loop can be used for any class that implements Iterable.
 * Where we will implement iterator() method that returns the Iterator object which is used in for each loop.
 */

public class MyIterableSpecs {

    public static void main(String[] args) {
        Integer[] a = {34,3,2,23,3};
        MyIterable<Integer> myIterableInteger = new MyIterable<>(a);

        for(Integer i:myIterableInteger) {
            System.out.println(i);
        }

    }

}

class MyIterable<T> implements Iterable<T> {

    private List<T> myIterableList;

    public MyIterable(T[] t) {
        this.myIterableList = Arrays.asList(t);
    }

    @Override
    public Iterator<T> iterator() {
        return myIterableList.iterator();
    }

}