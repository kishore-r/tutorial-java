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
package com.test.interfaces.nesting;

import com.test.interfaces.nesting.A.DImpl2;

/**
 * Nestinglnterfaces shows the various ways that nested interfaces can be implemented. In
 * particular, notice that when you implement an interface, you are not required to implement
 * any interfaces nested within. Also, private interfaces cannot be implemented outside of
 * their defining classes
 */
public class NestingInterfaces {

    public class BImp implements A.B {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    public class CImp implements A.C {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    // Cannot implement a private interface except
    // within that interface’s defining class:
    //! class DImp implements A.D {
    //! public void f() {}
    //! }


    public class EImp implements E {

        @Override
        public void g() {
            // TODO Auto-generated method stub

        }

    }

    class EGImp2 implements E.G {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    class EImp2 implements E {

        @Override
        public void g() {
            // TODO Auto-generated method stub

        }

        class EG implements E.G {

            @Override
            public void f() {
                // TODO Auto-generated method stub

            }

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A a = new A();

        // Can’t access A.D:
        //A.D ad =  a.getD();

        // Doesn’t return anything but A.D:
        /**
         * However,
            A.DImp2 can only be used as itself. You are not allowed to mention the fact that it
            implements the private interface D, so implementing a private interface is a way to force
            the definition of the methods in that interface without adding any type information (that is,
            without allowing any upcasting).
         */
        A.DImpl2 di =   (DImpl2)a.getD(); // upcasting to D doest happen here .
        di.f();

        // Cannot access a member of the interface:
        //a.getD().f()

        // Only another A can do anything with getD():
         A a2 = new A();

         a2.recieveD(a.getD());

    }



}
