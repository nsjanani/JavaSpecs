package com.java.specs.access_modifiers;

/**
 * variables with private access modifier is visible only inside its top level surrounding curly braces.
 * Both outerX and innerX is visible inside the classes Outer and Inner.
 *  These things are not necessarily restricted to a single class, but they might be visible inside other classes where class nesting is occurring.
 */
public class Outer {

    private int outerX;

    class Inner {
        private int innerX;

        public void innerTest() {
            System.out.println(innerX + outerX);
        }
    }

    public void outerTest() {
        Outer.Inner inner = new Outer().new Inner();
        System.out.println(inner.innerX + outerX);
    }
}
