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

public class C3 extends C implements I2{
    public static void main(String args[]) {
        C3 obj = new C3();
        obj.f(); // overloaded concept is used here so its no issue with the naming here
        obj.f(1); // overloaded concept is used here so its no issue with the naming here

    }

    @Override
    public int f(int i) { // over loaded concept -- same method name with different return type and parameters.
        // TODO Auto-generated method stub
        return 0;
    }

}
