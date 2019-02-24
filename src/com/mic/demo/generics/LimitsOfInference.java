//: com.mic.demo.generics/LimitsOfInference.java
package com.mic.demo.generics; /* Added by Eclipse.py */

import com.mic.demo.typeinfo.pets.Person;
import com.mic.demo.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void
    f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        // f(New.map()); // Does not compile
    }
} ///:~
