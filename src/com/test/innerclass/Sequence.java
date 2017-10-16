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
 *    Created on  Aug 18, 2015
 *
 ************************************************************************/
package com.test.innerclass;


public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object obj) {
        if (next < items.length) {
            items[next++] = obj;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            // TODO Auto-generated method stub
            return i == items.length;
        }

        @Override
        public Object current() {
            // TODO Auto-generated method stub
            return items[i];
        }

        @Override
        public void next() {
            // TODO Auto-generated method stub
            if (i < items.length) {
                i++;
            }
        }

    }

    public Selector getSelector() {
        return new SequenceSelector();
    }

    public static void main(String args[]) {
        Sequence sequnceObj = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequnceObj.add(Integer.toString(i));
        }

        Selector sselector = sequnceObj.getSelector();
        while (!sselector.end()) {
            System.out.println(sselector.current());
            sselector.next();
        }

    }

}
