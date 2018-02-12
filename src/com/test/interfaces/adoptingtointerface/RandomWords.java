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
 * the constructor for the Java SE5 Scanner class (which you’ll learn more about
 * in the Strings chapter) takes a Readable interface. You’ll find that Readable is not an
 * argument for any other method in the Java standard library—it was created solely for
 * Scanner, so that Scanner doesn’t have to constrain its argument to be a particular class.
 * This way, Scanner can be made to work with more types. If you create a new class and you
 * want it to be usable with Scanner, you make it Readable, like this:
 *
 *

 *The Readable interface only requires the implementation of a read( ) method. Inside
read( ), you add to the CharBuffer argument (there are several ways to do this; see the
CharBuffer documentation), or return -l when you have no more input.

Suppose you have a class that does not already implement Readable—how do you make it
work with Scanner? Here’s an example of a class that produces random floating point

Because you can add an interface onto any existing class in this way, it means that a method
that takes an interface provides a way for any class to be adapted to work with that method.
This is the power of using interfaces instead of classes.

numbers:

//: interfaces/RandomDoubles.java
import java.util.*;
public class RandomDoubles {
 private static Random rand = new Random(47);
 public double next() { return rand.nextDouble(); }
 public static void main(String[] args) {
 RandomDoubles rd = new RandomDoubles();
 for(int i = 0; i < 7; i ++)
 System.out.print(rd.next() + " ");
 }
} /* Output:
0.7271157860730044 0.5309454508634242 0.16020656493302599
0.18847866977771732 0.5166020801268457 0.2678662084200585
0.2613610344283964
 *
 */
public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        // TODO Auto-generated method stub\
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; // Number of characters appended

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext())
            System.out.println(s.next());
    }

}
