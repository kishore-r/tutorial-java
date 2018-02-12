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

import java.util.Map;

/**
 * a number of classes have been made Iterable, primarily all Collection classes
 * (but not Maps). For example, this code displays all the operating system environment
 * variables
 *
 * System.getenv( )7
  * returns a Map, entrySet( ) produces a Set of Map.Entry elements,
 *  and a Set is Iterable so it can be used in a foreach loop.
 */
public class EnvironmentVariables {

    public static void main(String args[]) {
        for (Map.Entry<String, String> entrySet : System.getenv().entrySet()) {
            System.out.println("key : " + entrySet.getKey() + " - " + " value: " + entrySet.getValue());

        }

    }

}
