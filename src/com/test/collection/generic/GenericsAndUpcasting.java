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
 * Thus, you can add a subtype of Apple to a container that is specified to hold Apple objects.
 * The output is produced from the default toString( ) method of Object, which prints the
 * class name followed by the unsigned hexadecimal representation of the hash code of the
 * object (generated by the hashCode( ) method). You�ll learn about hash codes in detail in
 * Containers in Depth
 */
public class GenericsAndUpcasting {
    public static void main(String args[]) {
        List<Apple> appleList = new ArrayList<Apple>();
        appleList.add(new SweetAppple());
        appleList.add(new GreenApple());
        for (Apple apple : appleList) {

            System.out.println(apple);
        }

    }

}
