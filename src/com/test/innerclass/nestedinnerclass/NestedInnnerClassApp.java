/************************************************************************
 *                                                                      *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by     - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      rak
 *    Created on  Oct 16, 2015
 *
 ************************************************************************/
package com.test.innerclass.nestedinnerclass;

/**
 * ----------------------------------
 *  WHEN ?
 * ----------------------------------
 * If you don’t need a connection between the inner-class object and the outerclass object, then
 * you can make the inner class static. This is commonly called a nested class.
 * To understand the meaning of static when applied to inner classes, you must remember that the object of
 * an ordinary inner class implicitly keeps a reference to the object of the enclosing class that
 * created it. 
 * 
 * This is not true, however, when you say an inner class is static. A nested class means:
 * 
 * ---------------------------------------------------------------------------------
 * RULE/RESTRICTION
 * 
 * ---------------------------------------------------------------------------------
 * 1. You don’t need an outer-class object in order to create an object of a nested class.
 * 2. You can’t access a non-static outer-class object from an object of a nested class.
 * 
 * ---------------------------------------------------------------------------------
 * WHAT DIFFERS?
 * 
 * ---------------------------------------------------------------------------------
 * Nested classes are different from ordinary inner classes in another way, as well. Fields and
 * methods in ordinary inner classes can only be at the outer level of a class, so ordinary inner
 * classes cannot have static data, static fields, or nested classes. However, nested classes can have
   all of these: 


 */
public class NestedInnnerClassApp {
    private static class ContentImpl implements Contents {

        private int i = 5;

        @Override
        public int value() {
            return i;
        }

    }

    protected static class DestinationImpl implements Destination {
        private String destiantion;

        // Nested classes can contain other static elements: 
        public static void x() {
        }

        public static final String SOME_CONSTANT = "A";

        DestinationImpl(String destination) {
            this.destiantion = destination;
        }

        @Override
        public String readLabel() {
            return destiantion;
        }

    }

    public static Destination getDestination(String destination) {
        return new DestinationImpl(destination);
    }

    public static Contents getContent() {
        return new ContentImpl();

    }

    /**
     * In main( ), no object of NestedInnnerClassApp is necessary; instead, you use the normal syntax for
     * selecting a static member to call the methods that return references to Contents and
       Destination.
     * in an ordinary (non-static) inner class, the link to the outer-class object is achieved with a special this reference. 
     * A nested class does not have a special this reference, which makes it analogous to a static method. 
     *
     * @param args
     */
    public static void main(String args[]) {
        @SuppressWarnings("unused")
        Contents contents = getContent();
        @SuppressWarnings("unused")
        Destination destination = getDestination("Tansania");
    }
}
