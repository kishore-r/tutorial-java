/************************************************************************
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by  - all rights reserved                             *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      rak
 *    Created on  Aug 18, 2015
 *
 ************************************************************************/
package com.test.innerclass.scopeinnerclass;

/**
 * The class TrackingSlip is nested inside the scope of an if statement. This does not mean
 * that the class is conditionally created—it gets compiled along with everything else. However,
 * it’s not available outside the scope in which it is defined. Other than that, it looks just like an
 * ordinary class.
 *          
 */
public class InnnerClassInsideScope {
    
    private void getTicketSlip(boolean slipStatus){
        if(slipStatus){
            class TicketSlip{
                private String id;
                public TicketSlip(String id) {
                    // TODO Auto-generated constructor stub
                    this.id = id;
                }
               private String getID(){
                   return id;
               }
            }
            System.out.println(new TicketSlip("Abc-123").getID());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InnnerClassInsideScope outterClassObj = new InnnerClassInsideScope();
        outterClassObj.getTicketSlip(true);

    }

}
