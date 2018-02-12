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
 *    Created on  Oct 31, 2015
 *
 ************************************************************************/
package com.test.innerclass.nestedinnerclass.usecase.clouserAndCallback;

public class Callee2 extends MyIncrement {
    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Clouser implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
        }

    }

    public Incrementable getCallableClousue() {
        return new Clouser();
    }

}
