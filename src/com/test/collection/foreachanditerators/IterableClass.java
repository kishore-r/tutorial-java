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

import java.util.Iterator;

/**
 * The reason that this works is that Java SE5 introduced a new interface called Iterable which
 * contains an iterator( ) method to produce an Iterator, and the Iterable interface is what
 * foreach uses to move through a sequence. So if you create any class that implements
 * Iterable, you can use it in a foreach statement:

 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                // Not implemented
                throw new UnsupportedOperationException();

            }
        };
    }

    public static void main(String args[]) {
        for (String s : new IterableClass()) {
            System.out.println(s + " ");
        }

    }

}
