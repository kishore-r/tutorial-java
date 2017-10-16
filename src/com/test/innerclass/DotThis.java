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

public class DotThis {
    public void f() {
        System.out.println("Print method od DotThis() Class");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DotThis dotthisObj = new DotThis();
        DotThis.Inner innerObj = dotthisObj.getInnerObj();
        dotthisObj.getInnerObj().getDotThisOutterClassObj().f();// chanining

        innerObj.getDotThisOutterClassObj().f();

    }

    public class Inner {
        public DotThis getDotThisOutterClassObj() {
            return DotThis.this;
        }

    }

    public Inner getInnerObj() {
        return new Inner();
    }

}
