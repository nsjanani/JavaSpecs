package com.java.specs.operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        /**
         * Spec #1: Avoids extra typing
         */
        System.out.println("Spec #1: Avoids extra typing");
        int x = 1000;
        x += 1; // rather than x = x+1;
        System.out.println(x);

        /**
         * Spec #2: Explicit cast for data types less than int - example - short
         * Using Assignment Operator, data types less than int can produce results of the original data type
         * As an example, adding two shorts using an assignment oeprator can produce short results
         * The assignment operator effectively cast its computed result to whatever type the assignment is being made into.
         */
        System.out.println("Spec #2: Explicit cast for data types less than int - example - short");
        short s = 10;
        s += s; // s= s+s
        System.out.println(s);

        s+= Integer.MAX_VALUE; // meaningless result due to overflow, but still the compiler won't complain, as the assignment operator does the casting
        long l1 = 999999999;
        s+= l1;
        System.out.println(s);

        /**
         * Spec #3: Unambiguity
         */
        System.out.println("Spec #3: Unambiguity - Example: 1");
        printByIndex(0);
        System.out.println("Spec #3: Unambiguity - Example: 2");
        callMe();
    }

    public static int[] getArray() {
        return new int[] {100,200,300,400,500,600,700};
    }

    public static void printByIndex(int i) {

        System.out.println(getArray()[i] = getArray()[i] +1); // getArray()[0] = getArray()[0] + 1)

        /**
         * expanded as getArray()[(i=i+1)] = getArray()[(i=i+1)] +1
         * After the first expression, i value incremented as 1 and used throughout
         * getArray()[1] = getArray[1]+1
         * After this, i value is incremented again and not used anywhere
         */
        System.out.println(getArray()[i++] = getArray()[i++] + 1); // getArray()[0] = getArray()[1] + 1) - i incremented to 2 in this step
        System.out.println(getArray()[++i] = getArray()[++i] +1); // getArray()[3] = getArray()[4] + 1) - i incremented to 4 in this step
        System.out.println(getArray()[++i] +=  1); // getArray()[5] = getArray()[5] + 1)
        System.out.println(getArray()[i++] +=  1); // getArray()[5] = getArray()[5] + 1)

//        for(int v: getArray()) {
//            System.out.println(v);
//        }
    }

    public static void callMe(){
        int[] arr = {100,200,300,400,500,600,700};
        int i =0;
        System.out.println(arr[i] = arr[i]+1); // i is 0
        System.out.println(arr[i++] = arr[i++]+1); // arr[0]= arr[1]+1; i is 0, incremented to 1 for next expression, incremented to 2 again which is not used
        System.out.println(arr[++i] = arr[++i] +1); // arr[3]= arr[4]+1;
        System.out.println(arr[++i] +=  1); //arr[5] = arr[5]+1;
        System.out.println(arr[i++] +=  1); //arr[5] = arr[5]+1; after this complete expression, i is incremented to 6

//        for(int v: arr){
//            System.out.println(v);
//        }
    }
}
