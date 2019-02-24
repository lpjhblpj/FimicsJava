//: com.mic.demo.generics/SuperTypeWildcards.java
package com.mic.demo.generics; /* Added by Eclipse.py */

import java.util.List;

public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error
    }
} ///:~
