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
package com.test.collection.map;

import java.util.HashMap;
import java.util.Map;

import com.test.collection.iteratorvscollection.Pets;

/**
 * Here’s an example that allows you to use a String description to look up Pet objects. It also
 * shows how you can test a Map to see if it contains a key or a value with containsKey( ) and
 * containsValue( ):
 */
public class PetMap {
    public static void main(String args[]) {
        Map<String, Pets> petMap = new HashMap<String, Pets>();
        petMap.put("K Pet", new Pets(123, "Dog"));
        petMap.put("L Pet", new Pets(124, "Cat"));
        System.out.println(petMap);
        Pets cat = petMap.get("L Pet");
        System.out.println(petMap.containsKey("K Pet"));
        System.out.println(petMap.containsValue(cat));

    }

}
