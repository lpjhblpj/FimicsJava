//: com.mic.demo.generics/SimplerPets.java
package com.mic.demo.generics; /* Added by Eclipse.py */

import com.mic.demo.mindview.util.New;
import com.mic.demo.typeinfo.pets.Person;
import com.mic.demo.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
} ///:~
