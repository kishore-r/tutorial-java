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
package com.test.interfaces.adoptingtointerface;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Adopting the Randomdoubles class to be used with Scanner Class by implementing the Readable Interface
 */
public class RandomDoubles implements Readable {
    private int counts = 0;
    private static Random rand = new Random(47);

    public RandomDoubles(int count) {
        this.counts = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        // TODO Auto-generated method stub
        if (counts == 0) {
            return -1;
        }
        while (counts > 0) {
            cb.append(rand.nextDouble() + "\n");
            counts--;
        }
        return counts;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(new RandomDoubles(10));
        while (s.hasNext())
            System.out.println(s.next());
    }

}
