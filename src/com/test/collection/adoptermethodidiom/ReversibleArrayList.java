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
import java.util.Collection;
import java.util.Iterator;

/**
 * One solution is what I call the Adapter Method idiom. The "Adapter" part comes from design
 * patterns, because you must provide a particular interface to satisfy the foreach statement.
 * When you have one interface and you need another one, writing an adapter solves the
 * problem. Here, I want to add the ability to produce a reverse iterator to the default forward
 * iterator, so I can’t override. Instead, I add a method that produces an Iterable object which
 * can then be used in the foreach statement. As you see here, this allows us to provide multiple
 *  ways to use foreach:
 *
 *  If you simply put the ral object in the foreach statement, you get the (default) forward
 *  iterator. But if you call reversed( ) on the object, it produces different behavior
 */
public class ReversibleArrayList<T> extends ArrayList<T> {

    /**
     * COMMENT - Add concise description of the purpose of this field.
     *           Description should go beyond the field's name.
     *
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -950073356998148285L;

    public ReversibleArrayList(Collection<T> c) {
        super(c);
        // TODO Auto-generated constructor stub
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {

            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return (T)get(current--);
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();

                    }
                };
            }
        };

    }

}
