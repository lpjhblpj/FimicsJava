//: com.mic.demo.generics/CheckedList.java
package com.mic.demo.generics; /* Added by Eclipse.py */
// Using Collection.checkedList().

import com.mic.demo.typeinfo.pets.Cat;
import com.mic.demo.typeinfo.pets.Dog;
import com.mic.demo.typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<Dog>();
        oldStyleMethod(dogs1); // Quietly accepts a Cat
        List<Dog> dogs2 = Collections.checkedList(
                new ArrayList<Dog>(), Dog.class);
        try {
            oldStyleMethod(dogs2); // Throws an exception
        } catch (Exception e) {
            System.out.println(e);
        }
        // Derived types work fine:
        List<Pet> pets = Collections.checkedList(
                new ArrayList<Pet>(), Pet.class);
        pets.add(new Dog());
        pets.add(new Cat());
    }
} /* Output:
java.lang.ClassCastException: Attempt to insert class com.mic.demo.typeinfo.pets.Cat element into collection with element type class com.mic.demo.typeinfo.pets.Dog
*///:~
