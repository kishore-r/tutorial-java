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

public class ImplementationFactory implements ServiceFactory {

    @Override
    public Service getService() {
        // TODO Auto-generated method stub
        return new Implementation1();
    }

}
