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
public class BigEggg2 extends Egg2 {
    class Yolk extends Egg2.Yolk {
        Yolk() {
            System.out.println("BigEggg2.Yolk()");
        }

        void f() {
            System.out.println("BigEggg2.Yolk.f()");
        }
    }

    BigEggg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        BigEggg2 be2 = new BigEggg2();
        be2.g();
    }
}
