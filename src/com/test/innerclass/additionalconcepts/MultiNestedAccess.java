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
 * 
 * REACHING OUTWARD FROM A MULTIPLY NESTED CLASS
 * 
 * 
 * It doesn’t matter how deeply an inner class may be nested—it can transparently access all of
 * the members of all the classes it is nested within, 
 */
class MultiNestedAccess {

    private void f() {
        System.out.println("method f()");
    }

    class Outter {

        private void g() {
            System.out.println("method g()");
        }

        class Inner {

            void h() {
                System.out.println("method h()");
                f(); // can access the private methods , regardless of  no of nested class 
                g();
            }
        }
    }
}
