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
 *    Created on  Nov 1, 2015
 *
 ************************************************************************/
package com.test.innerclass.overriding;

/**
 * COMMENT - Add description of this class or interface here. 
 *           Description should go beyond the class/interface name.
 *           Use the following template:
 * 
 * <Short description of class (noun phrase) followed by a dot>
 * <More elaborate description of what kind of object this class or interface represents.>
 * <Give information on (special) characteristics if possible.>
 */
public class Egg2 {
    protected class Yolk {
        Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    public Egg2() {
        System.out.println("Egg2()");
    }

    private Yolk y ;
    void insertYolk(Yolk yy) {
        y = yy;
    }

    void g() {
        y.f();
    }
}
