/************************************************************************
 *                                                                      *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by  - all rights reserved                             *
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
 * COMMENT - Add description of this class or interface here. 
 *     
 *           
 * You can’t have a named constructor in
 * an anonymous class (since there’s no name!), but with instance initialization, you can, in
 * effect, create a constructor for an anonymous inner class, like this: 
 * 
 *  an instance initializer is the constructor for
 *  an anonymous inner class. Of course, it’s limited; you can’t overload instance initializers, so
 *  you can have only one of these constructors. 
 */
public class AnonymousInnerClassWithConstructor {
    public static Base getBase(int i) {
        return new Base(i) { //i did not have to be final. While i is passed to the base constructor of
            //the anonymous class, it is never directly used inside the anonymous class. 
            { // instance 
                System.out.println("Inside instance initializer of anonymus Innner class");
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");

            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
