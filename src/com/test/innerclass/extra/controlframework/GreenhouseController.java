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


public class GreenhouseController {

    public static void main(String args[]) {
        GreenHouseControlls gcObj = new GreenHouseControlls();
        gcObj.addEvent(gcObj.new Bell(900));
        Event[] eventList = {
            gcObj.new ThermostatNight(0),
            gcObj.new LightsOn(200),
            gcObj.new LightsOff(400),
            gcObj.new WaterOn(600),
            gcObj.new WaterOff(800),
            gcObj.new ThermostatDay(1400)
            }; 
        gcObj.addEvent(gcObj.new Restart(2000, eventList));
        //gcObj.addEvent(gcObj.new Terminate(10000));
        
       /* if(args.length == 1)
            gcObj.addEvent(
            new GreenHouseControlls.Terminate(
            new Integer(args[0]))); */
        gcObj.addEvent(gcObj.new Terminate(10000));
        gcObj.run();
    }

}
