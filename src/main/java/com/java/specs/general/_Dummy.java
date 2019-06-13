package com.java.specs.general;

/**
 * Spec #1: Variable name can start with "_"
 */
public class _Dummy {

    /**
     * Spec #2: Variable name can start with "$"
     */
    private static int $; // Valid Variable Name

    public static void main(String[] args) {
        String a_b;
        System.out.println($);
    }
}
