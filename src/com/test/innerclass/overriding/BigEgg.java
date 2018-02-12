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

/**
 *  An inner class cannot be overriden like a method. 
 * 
 *  is it possible to "override" the entire inner class? This seems
 *  like it would be a powerful concept, but "overriding" an inner class as if it were another
 *  method of the outer class doesn’t really do anything: 
 * 
 * ------------------------------------------------------
 * 
 * ------------------------------------------------------
 * 
 * The default constructor is synthesized automatically by the compiler, and this calls the baseclass
 * default constructor. YOU MIGHT THINK THAT SINCE A BIGEGG IS BEING CREATED, THE
 * "OVERRIDDEN" VERSION OF YOLK WOULD BE USED, BUT THIS IS NOT THE CASE, AS YOU CAN SEE FROM THE
 * OUTPUT.
 * 
 *This example shows that there isn’t any extra inner-class magic going on when you inherit
 *from the OUTER class. The two inner classes are COMPLETELY SEPARATE ENTITIES, EACH IN ITS OWN
 *NAMESPACE. However, IT’S STILL POSSIBLE TO EXPLICITLY INHERIT FROM THE INNER CLASS: 
 * 
 */
public class BigEgg extends Egg {
    private Yolk y;

    class Yolk {
        Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public BigEgg() {
        // y = new Yolk();
        //System.out.println("BigEgg()");

    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
