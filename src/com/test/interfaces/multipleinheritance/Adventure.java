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
 * In class Adventure, you can see that there are four methods that take arguments of the
 * various interfaces and of the concrete class. When a Hero object is created, it can be passed
 * to any of these methods, which means it is being upcast to each interface in turn. Because of
 * the way interfaces are designed in Java, this works without any particular effort on the part of
 * the programmer.
 *
 * Keep in mind that one of the core reasons for interfaces is shown in the preceding example:
 * to upcast to more than one base type (and the flexibility that this provides). However, a
 * second reason for using interfaces is the same as using an abstract base class: to prevent the
 * client programmer from making an object of this class and to establish that it is only an
 * interface.
 */
public class Adventure {

    public static void t(CanFight fight) {
        fight.fight();
    }

    public static void u(CanFly canFly) {
        canFly.fly();
    }

    public static void v(CanSwim canSwim) {
        canSwim.swim();
    }

    public static void w(ActionCharacter ac) {
        ac.fight();
    }

    public static void main(String args[]) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanFly
        v(h); // Treat it as a CanSwim
        w(h); // Treat it as an ActionCharacter

    }
}
