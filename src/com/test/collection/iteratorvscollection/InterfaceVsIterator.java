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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Both versions of display( ) work with Map objects as well as with subtypes of Collection,
 * and both the Collection interface and the Iterator decouple the display( ) methods from
 * knowing about the particular implementation of the underlying container.
 * In this case the two approaches come up even. In fact, Collection pulls ahead a bit because
 * it is Iterable, and so in the implementation of display(Collection) the foreach construct
 * can be used, which makes the code a little cleaner.
 */
public class InterfaceVsIterator {

    public static void display(Collection<Pets> collection) {
        for (Pets pet : collection) {
            System.out.println(pet.getPetName());
        }

    }

    public static void display(Iterator<Pets> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getPetId());
        }
    }

    public static void main(String args[]) {
        Pets pets[] = { new Pets(121, "Dog"), new Pets(122, "Cat") };
        Set<Pets> petSets = new HashSet<Pets>(Arrays.asList(pets));
        Map<String, Pets> petMpas = new HashMap<String, Pets>();
        petMpas.put("kishore", pets[0]);
        petMpas.put("Ravi", pets[1]);
        display(Arrays.asList(pets));
        display(petSets.iterator());
        display(petMpas.values());
        display(petMpas.values().iterator());

    }

}
