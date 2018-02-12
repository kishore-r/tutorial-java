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

import java.util.ArrayList;
import java.util.List;

/**
 * COMMENT - Add description of this class or interface here. 
 *           Description should go beyond the class/interface name.
 *           Use the following template:
 * 
 * <Short description of class (noun phrase) followed by a dot>
 * <More elaborate description of what kind of object this class or interface represents.>
 * <Give information on (special) characteristics if possible.>
 */
public class Controller {
    List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event evt) {
        eventList.add(evt);
    }
    
    public void run(){
        while(eventList.size()>0){
            for(Event event: new ArrayList<Event>(eventList)){
                if(event.ready()){
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
