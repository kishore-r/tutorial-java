/************************************************************************
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

public class Factories {

    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        serviceConsumer(new ImplementationFactory());
        serviceConsumer(new Implementation2Factory());
    }

}
