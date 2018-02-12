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
package com.test.interfaces.extendinginterface;

public class VeryBadVampire implements Vampire {

    @Override
    public void destroy() {
        System.out.println("VeryBadVampire is destroy()");

    }

    @Override
    public void menace() {
        System.out.println("VeryBadVampire is menace()");
    }

    @Override
    public void kill() {
        System.out.println("VeryBadVampire is kill()");

    }

    @Override
    public void drinkBlood() {
        System.out.println("VeryBadVampire is drinkBlood()");

    }

}
