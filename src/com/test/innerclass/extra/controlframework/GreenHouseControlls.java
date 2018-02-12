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

/**
 * COMMENT - Add description of this class or interface here. 
 *           Description should go beyond the class/interface name.
 *           Use the following template:
 * 
 * <Short description of class (noun phrase) followed by a dot>
 * <More elaborate description of what kind of object this class or interface represents.>
 * <Give information on (special) characteristics if possible.>
 */
public class GreenHouseControlls extends Controller {
    private boolean lights = false;

    class LightsOn extends Event {

        LightsOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            lights = true;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "LightsOn...";
        }

    }

    class LightsOff extends Event {
        LightsOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            lights = false;
        }

        @Override
        public String toString() {
            return "LightsOff...";
        }
    }

    class WaterOn extends Event {

        WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "WaterOn...";
        }

    }

    private boolean water = false;

    class WaterOff extends Event {

        WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "WaterOff....";
        }

    }

    private String thermostat = "Day";

    class ThermostatNight extends Event {

        ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // TODO Auto-generated method stub
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "ThermostatNight...";
        }
    }

    class ThermostatDay extends Event {

        ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "ThermostatDay...";
        }

    }

    class Bell extends Event {

        Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Ringing Bell...";
        }
    }

    class Restart extends Event {
        private Event[] eventList;

        Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event evnt : eventList) {
                addEvent(evnt);
            }
        }

        @Override
        public void action() {
            for (Event evt : eventList) {
                evt.start();
                addEvent(evt);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting...";
        }

    }

    class Terminate extends Event {

        Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating..";
        }

    }
}
