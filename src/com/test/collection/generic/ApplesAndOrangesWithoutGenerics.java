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
 *    Created on  Nov 3, 2015
 *
 ************************************************************************/
package com.test.collection.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Apples and Oranges are placed into the container ( collection), then pulled out.
 * Normally, the Java compiler will give you a warning because the example does not use
 * generics. Here, a special Java SE5 annotation is used to suppress the warning. Annotations
 * start with an ‘@’ sign, and can take an argument; this one is @SuppressWarnings and the
 * argument indicates that "unchecked" warnings only should be suppressed:
 * 
 *  
 *  ---------------------------------------------------------------------
 *  Explanation 
 *  ---------------------------------------------------------------------
 *  
 *  Since ArrayList holds Objects, you can not
 *  only add Apple objects into this container using the ArrayList method add( ), but you can
 *  also add Orange objects without complaint at either compile time or run time. When you go
 *  to fetch out what you think are Apple objects using the ArrayList method get( ), you get
 *  back a reference to an Object that you must cast to an Apple. Then you need to surround
 *  the entire expression with parentheses to force the evaluation of the cast before calling the 
 *  getName() method 
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List sampleList = new ArrayList<>();
        sampleList.add(new Apple());
        sampleList.add(new Orange());
        for (int i = 0; i < sampleList.size(); i++) {
            ((Apple)sampleList.get(i)).getName(); // should throw an exception - > com.test.collection.generic.Orange cannot be cast to com.test.collection.generic.Apple
        }
    }

}
