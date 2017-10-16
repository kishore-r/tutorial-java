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
 *    Created on  Aug 18, 2015
 *
 ************************************************************************/
package com.test.innerclass;

public class DotNew {
    class Inner{
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DotNew dotNewObj = new DotNew();
        DotNew.Inner innerClassObj = dotNewObj.new Inner();
    }

}
