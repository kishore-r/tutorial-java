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
package com.test.collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * Queues are commonly used as a way to reliably transfer
 * objects from one area of a program to another
 *
 * Queues are especially important in concurrent
 * programming, as you will see in the Concurrency chapter, because they safely transfer
 * objects from one task to another.
 *
 *
 * LinkedList has methods to support queue behavior and it implements the Queue interface,
 * so a LinkedList can be used as a Queue implementation. By upcasting a LinkedList to a
 * Queue, this example uses the Queuespecific methods in the Queue interface:
 *
 * offer( ) is one of the Queue-specific methods; it inserts an element at the tail of the queue if
 * it can, or returns false. Both peek( ) and element( ) return the head of the queue without
 * removing it, but peek( ) returns null if the queue is empty and element( ) throws
 * NoSuchElementException. Both poll( ) and remove( ) remove and return the head of
 * the queue, but poll( ) returns null if the queue is empty, while remove( ) throws
 * NoSuchElementException
 *
 * Autoboxing automatically converts the int result of nextInt( ) into the Integer object
 * required by queue, and the char c into the Character object required by qc. The Queue
 * interface narrows access to the methods of LinkedList so that only the appropriate methods
 * are available, and you are thus less tempted to use LinkedList methods (here, you could
 * actually cast queue back to a LinkedList, but you are at least discouraged from doing so).
 * Notice that the Queue-specific methods provide complete and standalone functionality. That
 * is, you can have a usable Queue without any of the methods that are in Collection, from
 * which it is inherited.
 */
public class QueueDemo {
    public static <T> void printQ(Queue<T> queue) {

        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Queue<Integer> queueIntObj = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queueIntObj.offer(rand.nextInt(i + 10));
        }
        printQ(queueIntObj);

        Queue<Character> charQueueObj = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray()) {
            charQueueObj.offer(c);
        }

        printQ(charQueueObj);
    }

}
