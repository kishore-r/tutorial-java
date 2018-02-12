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

/**
 * As an added twist, interfaces can also be private, as seen in A.D (the same qualification
 *     syntax is used for nested interfaces as for nested classes). What good is a private nested
 *     interface? You might guess that it can only be implemented as a private inner class as in
 *     DImp, but A.DImp2 shows that it can also be implemented as a public class. However,
 *     A.DImp2 can only be used as itself ( means object should be created to DIm2). You are not allowed to mention the fact that it
 *     implements the private interface D, so implementing a private interface is a way to force
 *     the definition of the methods in that interface without adding any type information (that is,
 *     without allowing any upcasting).
 *
 *
 *     The method getD( ) produces a further quandary concerning the private interface: It’s a
 *     public method that returns a reference to a private interface. What can you do with the
 *     return value of this method? In main( ), you can see several attempts to use the return
 *     value, all of which fail. The only thing that works is if the return value is handed to an object
 *     that has permission to use it—in this case, another A, via the receiveD( ) method.

 *
 *
 *

 */
public class A {
    interface B {
        void f();
    }

    public class BImpl implements B {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    private class BImpl2 implements B {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    public interface C {
        void f();
    }

    public class CImpl implements C {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    private class CImpl2 implements C {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    private interface D {
        void f();
    }

    private class DImpl implements D {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    public class DImpl2 implements D {

        @Override
        public void f() {
            // TODO Auto-generated method stub

        }

    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;

    public void recieveD(D d) {
        this.dRef = d;
        dRef.f();
    }
}
