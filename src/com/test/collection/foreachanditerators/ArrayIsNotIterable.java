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
 *    Created on  Jan 18, 2015
 *
 ************************************************************************/
package com.test.collection.foreachanditerators;

import java.util.Arrays;

/**
 * A foreach statement works with an array or anything Iterable, but that doesn’t mean that an
 * array is automatically an Iterable, nor is there any autoboxing that takes place:
 * Trying to pass an array as an Iterable argument fails. There is no automatic conversion to
 * an Iterable; you must do it by hand.

 */
public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> iterableObj) {
        for (T t : iterableObj) {
            System.out.println(t);

        }

    }

    public static void main(String args[]) {
        test(Arrays.asList(1,2,3,4));

        String[] strings = { "A", "B", "C" };
        // An array works in foreach, but it’s not Iterable:
        //! test(strings);
        // You must explicitly convert it to an Iterable:
        test(Arrays.asList(strings));

    }

}
