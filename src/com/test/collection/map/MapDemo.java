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
import java.util.Random;

/**
 *
 * Random would produce a perfect distribution of numbers,
 * but to test this you need to generate many random numbers and count the ones that fall in
 * the various ranges. A Map easily solves the problem; in this case, the key is the number
 * produced by Random, and the value is the number of times that number appears:
 *
 * In main( ), autoboxing converts the randomly generated int into an Integer reference that
 * can be used with the HashMap (you can’t use primitives with containers). The get( )
 * method returns null if the key is not already in the container (which means that this is the
 * first time the number has been found). Otherwise, the get( ) method produces the associated
 * Integer value for the key, which is incremented (again, autoboxing simplifies the expression
 * but there are actually conversions to and from Integer taking place)
 *
 */
public class MapDemo {
    public static void main(String args[]) {
        Map<Integer, Integer> mapInt = new HashMap<Integer, Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10000; i++) {
            int ranInt = rand.nextInt(20);
            Integer alreadyAvailableInt = mapInt.get(ranInt);
            mapInt.put(ranInt, alreadyAvailableInt == null ? 1 : alreadyAvailableInt + 1);
        }
        System.out.println(mapInt);
    }

}
