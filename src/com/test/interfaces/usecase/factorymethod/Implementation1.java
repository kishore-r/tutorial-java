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

public class Implementation1 implements Service {
    Implementation1() { // package access

    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");

    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");

    }

}
