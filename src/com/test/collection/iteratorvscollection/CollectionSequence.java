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
 *    Created on  Jan 19, 2015
 *
 ************************************************************************/
package com.test.collection.iteratorvscollection;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * -- Theory --
 *
 *
 * One argument for having an interface is that it allows you to create more generic code. By
    writing to an interface rather than an implementation, your code can be applied to more
    types of objects.6 So if I write a method that takes a Collection, that method can be applied
    to any type that implements Collection—and this allows a new class to choose to implement
    Collection in order to be used with my method. It’s interesting to note, however, that the
    Standard C++ Library has no common base class for its containers—all commonality
    between containers is achieved through iterators. In Java, it might seem sensible to follow
    the C++ approach, and to express commonality between containers using an iterator rather
    than a Collection. However, the two approaches are bound together, since implementing
    Collection also means providing an iterator( ) method:

----
 *
 *
 * For example, if we create a Collection implementation by inheriting
 * from a class that holds Pet objects, we must implement all the Collection methods, even if
 * we don’t need to use them within the display( ) method. Although this can easily be
 * accomplished by inheriting from AbstractCollection, you’re forced to implement
 * iterator( ) anyway, along with size( ), in order to provide the methods that are not
 * implemented by AbstractCollection, but that are used by the other methods in
 * AbstractCollection:
 */
public class CollectionSequence extends AbstractCollection<Pets> {
    Pets[] pets = { new Pets(121, "Dog"), new Pets(122, "Cat") };

    @Override
    public Iterator<Pets> iterator() {

        return new Iterator<Pets>() {
            private int inex = 0;

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return inex < pets.length;
            }

            @Override
            public Pets next() {
                // TODO Auto-generated method stub
                return pets[inex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();

            }
        };
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence cs = new CollectionSequence();
        InterfaceVsIterator.display(cs);
        InterfaceVsIterator.display(cs.iterator());

    }

}
