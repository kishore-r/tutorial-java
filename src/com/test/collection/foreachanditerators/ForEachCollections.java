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

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * The reason that this works is that Java SE5 introduced a new interface called Iterable which
 * contains an iterator( ) method to produce an Iterator, and the Iterable interface is what
 * foreach uses to move through a sequence. So if you create any class that implements
 * Iterable, you can use it in a foreach statement:
 *
 *

 */
public class ForEachCollections {
    public static void main(String args[]) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "There should be an array generated and splited and given to add all constructro".split(" "));
        for (String collectionItem : cs) {
            System.out.println(collectionItem);
        }
    }

}
