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

public class Pets {
    private int petId;

    public Pets(int petId, String petName) {
        this.petId = petId;

        this.petName = petName;

    }

    private String petName;

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     *
     * @return Returns the petId.
     */
    public int getPetId() {
        return petId;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     *
     * @return Returns the petName.
     */
    public String getPetName() {
        return petName;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     *
     * @param petId The petId to set.
     */
    public void setPetId(int petId) {
        this.petId = petId;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     *
     * @param petName The petName to set.
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.petId + "-" + this.petName;
    }

}
