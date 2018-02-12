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

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     *
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name;
    }

}
