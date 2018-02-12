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
 *    Created on  Jan 17, 2015
 *
 ************************************************************************/
package com.test.interfaces;

import java.util.Random;

/**
 *Initializing fields in interfaces
 *
 * Fields defined in interfaces cannot be "blank finals," but they can be initialized with nonconstant
   expressions. For example:
 *
 */
public interface RandVals {
    Random RAND = new Random();
    int RAND_INT = RAND.nextInt();
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;

}
