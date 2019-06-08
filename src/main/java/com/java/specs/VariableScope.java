package com.java.specs;

public class VariableScope {

    public static void main(String[] args) {
          VariableScope v = new VariableScope();
          v.scopeTest();
    }

    public void scopeTest() {
        /**
         * Spec #1: Starts from the place where it has been defined and ends at the curly brace
         */
        for(int i=0; i<10; i++)
        {                               // Scope of 'i' - starts here
            System.out.println(i);
        }                               // Scope of 'i' - ends here
//        i = 19;                       // 'i' is undefined here

    }
}
