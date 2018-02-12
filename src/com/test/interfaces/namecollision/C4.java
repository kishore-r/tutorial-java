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

public class C4 extends C implements I3{


    public static void main( String args[]) {
        C4 obj = new C4();
        obj.f();// methods in the I3 and C are identical so , no collision
    }


}
