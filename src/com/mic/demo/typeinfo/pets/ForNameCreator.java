//: com.mic.demo.typeinfo/pets/ForNameCreator.java
package com.mic.demo.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "com.mic.demo.typeinfo.pets.Mutt",
            "com.mic.demo.typeinfo.pets.Pug",
            "com.mic.demo.typeinfo.pets.EgyptianMau",
            "com.mic.demo.typeinfo.pets.Manx",
            "com.mic.demo.typeinfo.pets.Cymric",
            "com.mic.demo.typeinfo.pets.Rat",
            "com.mic.demo.typeinfo.pets.Mouse",
            "com.mic.demo.typeinfo.pets.Hamster"
    };

    static {
        loader();
    }

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~
