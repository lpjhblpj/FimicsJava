//: com.mic.demo.typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package com.mic.demo.typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    // No try block needed.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class));
    // Types for random creation:
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),
                    allTypes.size());

    public static void main(String[] args) {
        System.out.println(types);
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} /* Output:
[class com.mic.demo.typeinfo.pets.Mutt, class com.mic.demo.typeinfo.pets.Pug, class com.mic.demo.typeinfo.pets.EgyptianMau, class com.mic.demo.typeinfo.pets.Manx, class com.mic.demo.typeinfo.pets.Cymric, class com.mic.demo.typeinfo.pets.Rat, class com.mic.demo.typeinfo.pets.Mouse, class com.mic.demo.typeinfo.pets.Hamster]
*///:~
