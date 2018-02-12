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
package com.test.interfaces.namecollision;

public class C1 implements I1, I2

{

    @Override
    public int f(int i) { // since  two methods f() satisfies the concepts of overloading behavior so its no issues in the naming
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void f() { // since  two methods f() satisfies the concepts of overloading behavior so its no issues in the naming
        // TODO Auto-generated method stub

    }

}
