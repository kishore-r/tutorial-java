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
package com.test.innerclass.inheriting;

/**
 * Because the inner-class constructor must attach to a reference of the enclosing class object,
 * things are slightly complicated when you inherit from an inner class. The problem is that the
 * "secret" reference to the enclosing class object must be initialized, and yet in the derived class
 * there’s no longer a default object to attach to. You must use a special syntax to make the
 * association explicit: 
 * 
 * ---------------------------------------------------------------------
 * EXPLANATION 
 * ---------------------------------------------------------------------
 * 
 * You can see that InheritInner is extending only the inner class, not the outer one. But when
 * it comes time to create a constructor, the default one is no good, and you can’t just pass a
 * reference to an enclosing object. In addition, you must use the syntax
 * enclosingClassReference.super();
 * inside the constructor. This provides the necessary reference, and the program will then
 * compile.
 * 
 * 
 */
public class InheritInner extends Within.Inner {
    public InheritInner(Within wi) {
        wi.super();
    }

    public static void main(String args[]) {
        Within wi = new Within();
        InheritInner inIn = new InheritInner(wi);
    }
}
