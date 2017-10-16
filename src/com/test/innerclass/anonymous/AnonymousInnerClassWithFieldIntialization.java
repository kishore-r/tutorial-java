/************************************************************************
 *                                                                      *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by   - all rights reserved                            *
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
 * You can also perform initialization when you define fields in an anonymous class. 
 * 
 * NOTE :- 
 * 
 * If you’re defining an anonymous inner class and want to use an object that’s defined outside
 * the anonymous inner class, the compiler requires that the argument reference be final, as
 * you see in the argument to getDestination( ). If you forget, you’ll get a compile-time error
 * message. 

 */
public class AnonymousInnerClassWithFieldIntialization {
    public Destination getDestination(final String dest) { // note this param  dest is final
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                // TODO Auto-generated method stub
                return label;
            }
        };
    }

    public static void main(String args[]) {
        AnonymousInnerClassWithFieldIntialization obj = new AnonymousInnerClassWithFieldIntialization();
        Destination destination = obj.getDestination("Tanzania");
        System.out.println(destination.readLabel());

    }
}
