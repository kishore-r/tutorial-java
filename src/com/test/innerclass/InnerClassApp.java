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
 *    Created on  Aug 17, 2015
 *
 ************************************************************************/
package com.test.innerclass;

import com.test.innerclass.InnerClassNormal.Content;
import com.test.innerclass.InnerClassNormal.Destination;

public class InnerClassApp {
    public static void main(String args[]) {
        InnerClassNormal innerclassNormalObj = new InnerClassNormal();
        InnerClassNormal.Content contect = innerclassNormalObj.new Content("Dress");
        InnerClassNormal.Destination destinationnObj = innerclassNormalObj.new Destination("Africa");
        innerclassNormalObj.setId(12345);
        innerclassNormalObj.showParcelID();
        System.out.println(contect.show());
        System.out.println(destinationnObj.getDestiantionName());

        // test inner class handle objects 
        InnerClassNormal innerclassNormalObj2 = new InnerClassNormal();
        Content contectobj2 = innerclassNormalObj2.getContentInstance("MobilePhone");
        Destination destinationObj2 = innerclassNormalObj2.to("madagaskar");

        innerclassNormalObj2.showParcelID();
        System.out.println(contectobj2.show());
        System.out.println(destinationObj2.getDestiantionName());
    }

}
