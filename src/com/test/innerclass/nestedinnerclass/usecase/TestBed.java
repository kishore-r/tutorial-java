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
package com.test.innerclass.nestedinnerclass.usecase;

/**
 * putting a main( ) in every class to act as a test bed for that
 * class. One drawback to this is the amount of extra compiled code you must carry around. If
 * this is a problem, you can use a nested class to hold your test code: 
 * 
 * ----------------------------------------------------------------------
 * EXPLANATION :
 * 
 * 
 * This generates a separate class called TestBed$Tester (to run the program, you say Java
 * TestBed$Tester, but you must escape the ‘$’ under Unix/Linux systems). You can use this
 * class for testing, but you don’t need to include it in your shipping product; you can simply
 * delete TestBed$Tester.class before packaging things up. 
 * 
 * ----------------------------------------------------------------------
 * 
 */
public class TestBed {

    public void display() {
        System.out.println("method display()");
    }

    public static class Tester {
        public static void main(String[] args[]) {
            TestBed obj = new TestBed();
            obj.display();
        }
    }
}
