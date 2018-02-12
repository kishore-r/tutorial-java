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
 *    Created on  Nov 3, 2015
 *
 ************************************************************************/
package com.test.innerclass.extra.controlframework;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    protected boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
