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
 *    Created on  Nov 6, 2017
 *
 ************************************************************************/
package com.test.collection.addingropofelemet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGropOfElement {
    public static void main(String args[]) {
        Collection<Integer> intCollection = (new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
        Integer[] moreInts = { 5, 6, 7, 8 };
        intCollection.addAll(Arrays.asList(moreInts)); // Runs significantly faster, but you can’t
        System.out.println(intCollection);
        // construct a Collection this way: 
        Collections.addAll(intCollection, 9, 10, 12); // Produces a list "backed by" an array: 
        System.out.println(intCollection);
        Collections.addAll(intCollection, moreInts);
        System.out.println(intCollection);

        List<Integer> intList2 = Arrays.asList(16, 17, 18, 19);
        intList2.set(1, 99);// // OK -- modify an element 
        System.out.println(intList2);
        intList2.add(20);// underlying array cannot be resized. 

    }

}
