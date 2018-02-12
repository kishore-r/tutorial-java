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
 *    Created on  Jan 17, 2015
 *
 ************************************************************************/
package com.test.interfaces.usecase.factorymethod;

public class Implementation2 implements Service {
    Implementation2() { // package access constructor

    }

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");

    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");

    }

}
