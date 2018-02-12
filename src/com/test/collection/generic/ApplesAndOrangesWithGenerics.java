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
 *    Created on  Nov 3, 2017
 *
 ************************************************************************/
package com.test.collection.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * to define an ArrayList intended to hold Apple objects, you say
 * ArrayList<Apple> instead of just ArrayList. The angle brackets surround the type
 * parameters (there may be more than one), which specify the type(s) that can be held by that
 * instance of the container. With generics, you’re prevented, at compile time, from putting the
 * wrong type of object into a container.3 Here’s the example again, using generics: 
 * 
 * --------------------------------------------------------------------------------
 * EXPLANATION
 * --------------------------------------------------------------------------------
 * 
 * Now the compiler will prevent you from putting an Orange into apples, so it becomes a
 * compile-time error rather than a runtime error. Also notice that the cast is no longer
 * necessary when fetching items back out from the List. Since the List knows what type it
 * holds, it does the cast for you when you call get( ). Thus, with generics you not only know
 *  * that the compiler will check the type of object that you put into a container, but you also get
 * cleaner syntax when using the objects in the container. The example also shows that, if you
 * do not need to use the index of each element, you can use the foreach syntax to select each
 * element in the List. You are not limited to putting the exact type of object into a container
 * when you specify that type as a generic parameter. Upcasting works the same with generics
 * as it does with other types: 

 * 
 * 
 */
public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<Apple>();
        for (int i = 0; i < 5; i++) {
            Apple apple = new Apple();
            apple.setName("apple " + i);
            appleList.add(apple); // try adding Orange and check what type of compile time error you get.
        }

        for (Apple apple : appleList) {
            System.out.println(apple.getName());
        }
    }

}
