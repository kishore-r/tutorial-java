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
 *    Created on  Oct 17, 2017
 *
 ************************************************************************/
package com.test.innerclass.nestedinnerclass.classinsideinterface;

/**
 * ----------------------------------------------
 * WHAT?
 * ----------------------------------------------
 * Normally, you can’t put any code inside an interface, but a nested class can be part of an
 * interface. Any class you put inside an interface is automatically public and static. Since the
 * class is static, it doesn’t violate the rules for interfaces—the nested class is only placed inside
 * the namespace of the interface. You can even implement the surrounding interface in the
 * inner class, like this: 
 * 
 * ------------------------------------------------
 * WHY ?
 * ------------------------------------------------
 */
public interface ClassInInterface {
    void display();

    class interfaceClass implements ClassInInterface {
        @Override
        public void display() {
            System.out.println("inside display ");
        }

        public static void main(String args[]) {
            new interfaceClass().display();
        }

    }

}
