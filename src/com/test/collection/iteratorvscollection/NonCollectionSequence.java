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
 *    Created on  Jan 19, 2018
 *
 ************************************************************************/
package com.test.collection.iteratorvscollection;

import java.util.Iterator;

/**
 *

 *  if your class already inherits from another
 * class, then you cannot also inherit from AbstractCollection. In that case, to implement
 * Collection you’d have to implement all the methods in the interface. In this case it would be
 * much easier to inherit and add the ability to create an iterator:

 */
public class NonCollectionSequence {
    Pets[] pets = { new Pets(121, "Dog"), new Pets(122, "Cat") };

    public Iterator<Pets> getIterator() {
        return new Iterator<Pets>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return index < pets.length;
            }

            @Override
            public Pets next() {
                // TODO Auto-generated method stub
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String args[]) {
        NonCollectionSequence noncollectionSequence = new NonCollectionSequence();
        InterfaceVsIterator.display(noncollectionSequence.getIterator());

    }
}
