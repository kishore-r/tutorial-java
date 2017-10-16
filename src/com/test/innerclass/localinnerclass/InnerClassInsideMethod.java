package com.test.innerclass.localinnerclass;

import com.test.innerclass.DetinationInterface;

/**
 * a local inner class cannot  have access modifiers,  abstract or final is permitted. 
 * The first example shows the creation of an entire class within the scope of a method (instead
 * of the scope of another class). This is called a local inner class: 
 * Nesting a class within a method. 
 */
public class InnerClassInsideMethod {
    public DetinationInterface getDestiation(String s) {
        class PDestination implements DetinationInterface {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String getLabel() {
                // TODO Auto-generated method stub
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        InnerClassInsideMethod outterObj = new InnerClassInsideMethod();
        System.out.println(outterObj.getDestiation("Tansaniya").getLabel());

    }
}
