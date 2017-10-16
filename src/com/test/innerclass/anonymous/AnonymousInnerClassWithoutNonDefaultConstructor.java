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
 *    Created on  Sep 6, 2015
 *
 ************************************************************************/
package com.test.innerclass.anonymous;

/**
 * Anonymous Inner Class Without Non Default Constructor . 
 * The following code shows what to do if your base class needs a constructor with an argument: 
 * 
 * 
 * That is, you simply pass the appropriate argument to the base-class constructor, seen here as
 * the x passed in new Wrapping(x). Although it’s an ordinary class with an implementation,
 * Wrapping is also being used as a common "interface" to its derived classes: 
 * 
 * 
 * NOTE :
 * 
 * The semicolon at the end of the anonymous inner class doesn’t mark the end of the class
 * body. Instead, it marks the end of the expression that happens to contain the anonymous
 * class. Thus, it’s identical to the use of the semicolon everywhere else. 
 * 
 */
public class AnonymousInnerClassWithoutNonDefaultConstructor {

    public Wrapping getWarping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 50;
            }

        };
    }

}
