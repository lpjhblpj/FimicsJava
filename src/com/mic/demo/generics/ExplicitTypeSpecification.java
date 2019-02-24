//: com.mic.demo.generics/ExplicitTypeSpecification.java
package com.mic.demo.generics; /* Added by Eclipse.py */

import com.mic.demo.mindview.util.New;
import com.mic.demo.typeinfo.pets.Person;
import com.mic.demo.typeinfo.pets.Pet;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
} ///:~
