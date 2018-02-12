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
public class Callee1 implements Incrementable {
    private int i = 0;

    /** {@inheritDoc} */
    @Override
    public void increment() {
        ++i;
        System.out.println(i);
    }

}
