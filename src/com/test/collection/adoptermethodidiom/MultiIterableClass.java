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
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.test.collection.foreachanditerators.IterableClass;

public class MultiIterableClass<T> extends IterableClass {
    /**
     * COMMENT - Add concise description of the purpose of this field.
     *           Description should go beyond the field's name.
     *
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1470537619872842074L;

    public Iterable<T> reversed() {
        return new Iterable<T>() {

            @Override
            public Iterator<T> iterator() {
                // TODO Auto-generated method stub

                return new Iterator<T>() {
                    private int count = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        // TODO Auto-generated method stub
                        return count > -1;
                    }

                    @Override
                    public T next() {
                        // TODO Auto-generated method stub
                        return (T)words[count--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();

                    }
                };
            }
        };
    }

    public Iterable<T> shuffle() {
        return new Iterable<T>() {

            @Override
            public Iterator<T> iterator() {

                // look at example to know why we need an intermediate list
                /**
                 * You can see from the output that the Collections.shuffle( ) method doesn’t affect the
                    original array, but only shuffles the references in shuffled. This is only true because the
                    randomized( ) method wraps an ArrayList around the result of Arrays.asList( ). If the
                    List produced by Arrays.asList( ) is shuffled directly, it will modify the underlying array, as
                    you can see here
                 */
                List<String> shuffled = new ArrayList<String>(Arrays.asList(words)); /// why this ? prevent underlying words being modified
                Collections.shuffle(shuffled, new Random(47));
                return (Iterator<T>)shuffled.iterator();

            }
        };
    }

    public static void main(String args[]) {
        MultiIterableClass<String> mulIO = new MultiIterableClass<String>();

        System.out.println("Reversed");
        for (String s : mulIO.reversed()) {
            System.out.println(s);
        }
        System.out.println("Shuffled");
        for (String s : mulIO.shuffle()) {
            System.out.println(s);
        }
        System.out.println("Real Iterator");
        for (String s : mulIO) {
            System.out.println(s);
        }
    }

}
