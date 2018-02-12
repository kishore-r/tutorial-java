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
 *    Created on  Nov 3, 2017
 *
 ************************************************************************/
package com.test.innerclass.extra;

/**
 * It is implemented as both a local class and an
 * anonymous inner class, both of which have the same behaviors and capabilities. Since the
 * name of the local inner class is not accessible outside the method, the only justification for
 * using a local inner class instead of an anonymous inner class is if you need a named
 * constructor and/or an overloaded constructor, since an anonymous inner class can only use
 * instance initialization.
 * 
 * Another reason to make a local inner class rather than an anonymous inner class is if you
 * need to make more than one object of that class. 
 */
public class LocalInnerVersusAnonymous {
    private int count = 0;

    Counter getAnonymousCounter(final String name) {
        return new Counter() {
            {
                System.out.println("Counter()");
            }

            @Override
            public void increment() {
                System.out.print(name);
                System.out.println(count++);

            }
        };
    }

    Counter getLocalInnerClassCounter(final String name) {
        class CounterLocalInnerClass implements Counter {
            CounterLocalInnerClass() {
                System.out.println("CounterLocalInnerClass()");
            }

            @Override
            public void increment() {
                System.out.print(name);
                System.out.println(count++);
            }

        }
        return new CounterLocalInnerClass();
    }

    public static void main(String args[]) {
        LocalInnerVersusAnonymous obj = new LocalInnerVersusAnonymous();
        Counter counter1 = obj.getAnonymousCounter("Test Anonymous");
        Counter counter2 = obj.getLocalInnerClassCounter("Test Local Inner Class");
        for (int i = 0; i < 5; i++)
            counter1.increment();
        for (int i = 0; i < 5; i++)
            counter2.increment();
    }
}
