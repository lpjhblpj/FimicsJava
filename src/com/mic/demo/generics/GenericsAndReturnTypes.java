//: com.mic.demo.generics/GenericsAndReturnTypes.java
package com.mic.demo.generics; /* Added by Eclipse.py */

interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter> {
}

public class GenericsAndReturnTypes {
    void test(Getter g) {
        Getter result = g.get();
        GenericGetter gg = g.get(); // Also the base type
    }
} ///:~
