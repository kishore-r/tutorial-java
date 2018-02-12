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
 *    Created on  Nov 1, 2015
 *
 ************************************************************************/
package com.test.innerclass.overriding;

public class Egg {
    private Yolk y;

    protected class Yolk {
        Yolk() {
            System.out.println(" Yolk()");
        }
    }

    Egg() {
        System.out.println("Egg()");
        y = new Yolk();
    }

}
