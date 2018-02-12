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

public class DragonZilla implements DangerousMonster {

    @Override
    public void menace() {
       System.out.println("DragonZilla is meanace()");

    }

    @Override
    public void destroy() {
        System.out.println("DragonZilla is destroy()");
    }

}
