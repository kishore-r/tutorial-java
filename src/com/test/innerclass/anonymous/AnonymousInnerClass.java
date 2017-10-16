/************************************************************************
 *                                                                      *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by  - all rights reserved                             *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      rak
 *    Created on  Sep 6, 2015
 *
 ************************************************************************/
package com.test.innerclass.anonymous;

/**
 * An anonymous class implementing an interface . 
 * 
 * -----------------------------------------------------
 * RULE:
 * -----------------------------------------------------
 * Anonymous inner classes are somewhat limited compared to regular inheritance, because
 * they can either extend a class or implement an interface, but not both. And if you do
 * implement an interface, you can only implement one. 
 * 
 * 
 * ----------------------------------------------------
 * 
 * The getDestination( ) method combines the creation of the return value with the definition of the
 * class that represents that return value! In addition, the class is anonymous; it has no name.
 
 * To make matters a bit worse, it looks like you’re starting out to create a Contents object, But
 * then, before you get to the semicolon, you say, "But wait, I think I’ll slip in a class definition."
 * 
 *  What this strange syntax means is "Create an object of an anonymous class that’s inherited
 * from Contents." The reference returned by the new expression is automatically upcast to a
 * Contents reference. The anonymous inner-class syntax is a shorthand for: 
 * 
 * 
 * Below code can be effectively shortened with an Anonymous inner class. 
 * --------------------------------------
 * Normal inner class 
 * --------------------------------------
 * public class AnonymousInnerClass {
 *  class MyDestination implements Destination {
 *  private int i = 11;
 *  @Override
 *  public String readLabel() {
       return "";
    }
 * public Destination getDestination() { return new MyDestination(); }
 * public static void main(String[] args) {
 * AnonymousInnerClass p = new AnonymousInnerClass();
 * Destination c = p.getDestination();
 }
} ///:~ 

 */
public class AnonymousInnerClass {

    public Destination getDestination() {
        return new Destination() {

            @Override
            public String readLabel() {
                // TODO Auto-generated method stub
                return "";
            }
        };
    }
}
