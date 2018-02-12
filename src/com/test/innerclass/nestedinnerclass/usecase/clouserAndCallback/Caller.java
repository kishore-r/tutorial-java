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
 *    Created on  Oct 31, 2015
 *
 ************************************************************************/
package com.test.innerclass.nestedinnerclass.usecase.clouserAndCallback;

/**
 * A closure is a callable object that retains information from the scope in which it was created.
 * From this definition, you can see that an inner class is an object-oriented closure, because it
 * doesn’t just contain each piece of information from the outer-class object ("the scope in
 * which it was created"), but it automatically holds a reference back to the whole outer-class
 * object, where it has permission to manipulate all the members, even private ones.
 * 
 * --------------------------------------------------------------------
 * CALLBACKS
 * --------------------------------------------------------------------
 * 
 *  With a callback, some other object is given a piece of
 *  information that allows it to call back into the originating object at some later point. 
 *  The closure provided by the inner class is a good solution—more flexible and far safer than a
 *  pointer. Here’s an example:
 *  
 *  
 *  -------------------------------------------------------------------
 *  EXPLANATION
 *  -------------------------------------------------------------------
 *  
 *  This also shows a further distinction between implementing an interface in an outer class
 * versus doing so in an inner class. Callee1 is clearly the simpler solution in terms of the code.
 * Callee2 inherits from Mylncrement, which already has a different increment( ) method
 * that does something unrelated to the one expected by the Incrementable interface. When
 * Mylncrement is inherited into Callee2, increment( ) can’t be overridden for use by
 * Incrementable, so you’re forced to provide a separate implementation using an inner class.
 * Also note that when you create an inner class, you do not add to or modify the interface of the
 * outer class.
 * 
 * Everything except getCallbackReference( ) in Callee2 is private. To allow any
 *  * connection to the outside world, the interface Incrementable is essential. Here you can see
 * how interfaces allow for a complete separation of interface from implementation.
 * The inner class Closure implements Incrementable to provide a hook back into Callee2—
 *  * but a safe hook. Whoever gets the Incrementable reference can, of course, only call
 * increment( ) and has no other abilities (unlike a pointer, which would allow you to run
wild).

 * Caller takes an Incrementable reference in its constructor (although the capturing of the
 * callback reference could happen at any time) and then, sometime later, uses the reference to
 * "call back" into the Callee class.
 * 
 * 
 * The value of the callback is in its flexibility; you can dynamically decide what methods will be
 * called at run time.
 * 
 */
public class Caller {
    private Incrementable callbackReference;

    public Caller(Incrementable callbackReference) {
        // TODO Auto-generated constructor stub
        this.callbackReference = callbackReference;
    }

    void go() {
        callbackReference.increment();
    }

    public static void main(String args[]) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallableClousue());
        
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go(); 
    }

}
