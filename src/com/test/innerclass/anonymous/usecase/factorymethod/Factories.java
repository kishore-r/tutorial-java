/************************************************************************
 *                                                                      *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by  - all rights reserved                             *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      rak
 *    Created on  Sep 6, 2015
 *
 ************************************************************************/
package com.test.innerclass.anonymous.usecase.factorymethod;

import java.util.Calendar;

/**
 * Factory Method pattern.
 *
 * the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects
 * without having to specify the exact class of the object that will be created.
 * This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes,
 * or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.
 *
 *
 * WHEN ?
 * ---------------------------------------------------------------------------------------------------
 * When a class doesn't know what sub-classes will be required to create
 * When a class wants that its sub-classes specify the objects to be created.
 * When the parent classes choose the creation of objects to its sub-classes.
 *
 * ----------------------------------------------------------------------------------------------------
 *
 * ----------------------------------------------------------------------------------------------------
 * Factory methods are static methods that return an instance of the native class. Examples in the JDK:
 * ----------------------------------------------------------------------------------------------------
 *  LogManager.getLogManager
 *  Pattern.compile
 *  Collections.unmodifiableCollection, Collections.synchronizeCollection , and so on
 *  Calendar.getInstance
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String args[]) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);

    }

}
