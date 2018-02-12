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
package com.test.collection.adoptermethodidiom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * In the first case, the output of Arrays.asList( ) is handed to the ArrayList( ) constructor,
 * and this creates an ArrayList that references the elements of sourceInteger. Shuffling these references
 * doesn’t modify the array. However, if you use the result of Arrays.asList(sourceInteger) directly,
 * shuffling modifies the order of ia. It’s important to be aware that Arrays.asList( ) produces
 * a List object that uses the underlying array as its physical implementation. If you do
 * anything to that List that modifies it, and you don’t want the original array modified, you
 * should make a copy into another container
 */
public class ModifyingArraysAsList {
    public static void main(String args[]) {
        Integer[] sourceInteger = { 1, 2, 3, 4, 5 };
        List<Integer> arrayListInteger = new ArrayList<>(Arrays.asList(sourceInteger));

        System.out.println("Before Shuffling:" + arrayListInteger);
        Collections.shuffle(arrayListInteger, new Random(47));
        System.out.println("After Shuffling:" + arrayListInteger);
        System.out.println("Array Shuffling:" + Arrays.toString(sourceInteger));

        List<Integer> arrayListInteger2 = Arrays.asList(sourceInteger);
        System.out.println("Before Shuffling:" + arrayListInteger2);
        Collections.shuffle(arrayListInteger2, new Random(47));
        System.out.println("After Shuffling:" + arrayListInteger2);
        System.out.println("Array Shuffling:" + Arrays.toString(sourceInteger));

    }

}
