package com.java.specs.loops;

public class BreakContinueSpecs {

    public static void main(String[] args) {

        /**
         * Spec #1 : Continue with while loop
         * Continue will go to the top of the loop and test the condition again
         * Note: The below code will lead into infinite loop
         */
        int i=-1;
        while(i<10) {
            System.out.println("I'm in a loop " + i);
            if(i++ == 5) {
                System.out.println("I'm before the continue.. about to skip 5");
                continue;
            }
            System.out.println("Statement after continue in the loop block");
        }

        /**
         * Spec #2: Above example applies to do while loop as well
         * Continue will go to the top of the loop and test the condition again
         */

        /**
         * Spec #3 : Continue with for loop
         * Continue will go to the top of the loop - incremental section and then test the condition
         * Note: The below code will lead into infinite loop
         */
        System.out.println("Spec #3 *******");
        for(int j=0;j<10;j++) {
            if(j==5) {
                System.out.println("I'm in the middle of the for loop and am trying to continue");
                continue;
            }
            System.out.println("I'm in a for loop " + j);
        }

        /**
         * Spec #4 : Once exited out of the loop, Break will execute the below part and then jumps to the start
         */
        System.out.println("Spec #4 *******");
        for(int j=0;j<10;j++) {
            System.out.println("I'm in the for loop " + j);
            if(j==5) {
                System.out.println("I'm in the middle of the for loop and am trying to break");
                break;
            }
            System.out.println("Finishing off the remaining"); // This will be executed by break
        }

        /**
         * Spec #5 : Once exited out of the loop, Continue will never execute the below part and then jumps directly to the start
         * Continue will go to the top of the loop - incremental section and then test the condition
         * Note: The below code will lead into infinite loop
         */
        System.out.println("Spec #5 *******");
        for(int j=0;j<10;j++) {
            System.out.println("I'm in the for loop " + j);
            if(j==5) {
                System.out.println("I'm in the middle of the for loop and am trying to continue");
                continue;
            }
            System.out.println("Finishing off the remaining"); // This will never get printed
        }
    }

}
