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

import java.util.Arrays;

public class AdapterMethodIdiom {
    public static void main(String args[]) {
        ReversibleArrayList<String> reversableArray = new ReversibleArrayList<String>(Arrays.asList("Reversed Array".split(" ")));

        for (String revArray : reversableArray) {
            System.out.println(revArray);

        }
        System.out.println("-----");
        for (String revArray : reversableArray.reversed()) {
            System.out.println(revArray);

        }
    }

}
