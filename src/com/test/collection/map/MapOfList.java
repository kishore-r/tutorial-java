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
 *    Created on  Jan 19, 2015
 *
 ************************************************************************/
package com.test.collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.collection.iteratorvscollection.Pets;

/**
 * A Map can return a Set of its keys, a Collection of its values, or a Set of its pairs. The
 * keySet( ) method produces a Set of all the keys in petPeople, which is used in the foreach
 * statement to iterate through the Map.
 */
public class MapOfList {

    public static void main(String args[]) {
        Map<Person, List<? extends Pets>> listPets = new HashMap<Person, List<? extends Pets>>();
        listPets.put(new Person("Kishore"), Arrays.asList(new Pets(123, "Dog"), new DangerousPets(124, "Cat")));
        listPets.put(new Person("Ravi"), Arrays.asList(new LocalPets(125, "Dog2"), new DangerousPets(126, "Cat2")));
        System.out.println(listPets);
        System.out.println("Persons" + listPets.keySet());
        System.out.println("pets" + listPets.values());

        for (Person person : listPets.keySet()) {
            System.out.println("Person - " + person.getName() + " has :");
            for (Pets p : listPets.get(person)) {
                System.out.println("        " + p.getPetName());
            }
        }

    }

}
