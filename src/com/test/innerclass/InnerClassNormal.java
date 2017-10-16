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

public class InnerClassNormal {
    private int id;

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @return Returns the id.
     */
    public int getId() {
        return id;
    }

    /**
     * COMMENT - Add concise description of this setter method.
     *           Description should go beyond the method name.
     * 
     * @param id The id to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    public class Destination {
        private String destinaltionAddress;

        public Destination(String destinaltionAddress) {
            this.destinaltionAddress = destinaltionAddress;
        }

        public String getDestiantionName() {
            return destinaltionAddress;
        }

    }

    public class Content {
        String contentName;

        public Content(String contentName) {
            this.contentName = contentName;
            System.out.println("inside inner class Content");
        }

        public String show() {
            return contentName;
        }
    }

    //inner handles supplying inner class objects 
    public Destination to(String destination) {
        return new Destination(destination);
    }

    public Content getContentInstance(String ContentName) {
        return new Content(ContentName);
    }

    public void showParcelID() {
        System.out.println("ID:" + id);
    }
}
