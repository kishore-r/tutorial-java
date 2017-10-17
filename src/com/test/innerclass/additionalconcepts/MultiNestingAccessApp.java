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
        MultiNestedAccess.Outter.Inner inner = outter.new Inner();
        inner.h();
    }
}