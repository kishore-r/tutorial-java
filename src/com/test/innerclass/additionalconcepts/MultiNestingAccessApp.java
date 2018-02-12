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
 *    Created on  Oct 17, 2015
 *
 ************************************************************************/
package com.test.innerclass.additionalconcepts;

/**
 *  Example application for REACHING OUTWARD FROM A MULTIPLY NESTED CLASS. 
 */
public class MultiNestingAccessApp {
    public static void main(String[] args) {

        MultiNestedAccess mna = new MultiNestedAccess();
        MultiNestedAccess.Outter outter = mna.new Outter();
        
        /**
         * You can see that in MultiNestedAccess, the methods g( ) and f( ) are callable without any qualification
         * (despite the fact that they are private). This example also demonstrates the syntax
         * necessary to create objects of multiply nested inner classes when you create the objects in a
         * different class. The ".new" syntax produces the correct scope, so you do not have to qualify
         * the class name in the constructor call. 
         */
        MultiNestedAccess.Outter.Inner inner = outter.new Inner(); // look how  they refer to the Deep inner classes and how they create obj from outter
        inner.h();
    }
}