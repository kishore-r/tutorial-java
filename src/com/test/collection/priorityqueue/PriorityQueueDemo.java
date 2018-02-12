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
package com.test.collection.priorityqueue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

import com.test.collection.queue.QueueDemo;

/**
 * When you offer( ) an object onto a PriorityQueue, that object is sorted into the queue.5
 * The default sorting uses the natural order of the objects in the queue, but you can modify the
 * order by providing your own Comparator. The PriorityQueue ensures that when you call
 * peek( ), poll( ) or remove( ), the element you get will be the one with the highest priority.
 *
 * This actually depends on the implementation. Priority queue algorithms typically sort on insertion (maintaining a heap),
 * but they may also perform the selection of the most important element upon removal. The choice of algorithm could be
 * important if object priority can change while it is waiting in the queue
 *
 *
 * You can see that duplicates are allowed, and the lowest values have the highest priority (in
 * the case of String, spaces also count as values and are higher in priority than letters). To
 * show how you can change the ordering by providing your own Comparator object, the third
 * constructor call to PriorityQueue<Integer> and the second call to
 * PriorityQueue<String> use the reverse-order Comparator produced by
 * Collections.reverseOrder( )
 *
 * The last section adds a HashSet to eliminate duplicate Characters, just to make things a
 * little more interesting.
 * Integer, String and Character work with PriorityQueue because these classes already
 * have natural ordering built in. If you want you use your own class in a PriorityQueue, you
 * must include additional functionality to produce natural ordering, or provide your own
 * Comparator


 */
public class PriorityQueueDemo {

    public static void main(String args[]) {
        PriorityQueue<Integer> prioriQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            prioriQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(prioriQueue);
        System.out.println("--End Random int priorty queue--");
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);

        prioriQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        prioriQueue.addAll(ints);

        QueueDemo.printQ(prioriQueue);
        System.out.println("--End int reverse order  priorty queue--");

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> stingList = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(stingList);
        QueueDemo.printQ(stringPQ);
        System.out.println("--End String  priorty queue--");
        stringPQ = new PriorityQueue<String>(stingList.size(), Collections.reverseOrder());
        stringPQ.addAll(stingList);
        QueueDemo.printQ(stringPQ);
        System.out.println("--End  Reversed String  priorty queue--");
        Set<Character> charSet = new HashSet<Character>();

        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }

        PriorityQueue<Character> charPriorityQ = new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(charPriorityQ);
        System.out.println("--End  Char Set  priorty queue--");

    }

}
