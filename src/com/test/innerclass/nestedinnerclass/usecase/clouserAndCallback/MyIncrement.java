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
 *    Created on  Oct 31, 2015
 *
 ************************************************************************/
package com.test.innerclass.nestedinnerclass.usecase.clouserAndCallback;

/**
 * COMMENT - Add description of this class or interface here. 
 *           Description should go beyond the class/interface name.
 *           Use the following template:
 * 
 * <Short description of class (noun phrase) followed by a dot>
 * <More elaborate description of what kind of object this class or interface represents.>
 * <Give information on (special) characteristics if possible.>
 */
public class MyIncrement {
    void increment() {
        System.out.println("inside My increment");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }

}
