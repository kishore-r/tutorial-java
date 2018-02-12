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
package com.test.interfaces.multipleinheritance;

/**
 *
 * The signature for fight( ) is the same in the interface CanFight and the class
 * ActionCharacter, and that fight( ) is not provided with a definition in Hero. You can
 * extend an interface, but then you’ve got another interface. When you want to create an
 * object, all the definitions must first exist. Even though Hero does not explicitly provide a
 * definition for fight( ), the definition comes along with ActionCharacter; thus, it’s possible
 * to create Hero objects.
 */
public class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

    @Override
    public void swim() {
        // TODO Auto-generated method stub

    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

    }

}
