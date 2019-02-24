//: com.mic.demo.enumerated/RoShamBo.java
// Common tools for RoShamBo examples.
package com.mic.demo.enumerated;

import com.mic.demo.mindview.util.Enums;

public class RoShamBo {
    public static <T extends Competitor<T>>
    void match(T a, T b) {
        System.out.println(
                a + " vs. " + b + ": " + a.compete(b));
    }

    public static <T extends Enum<T> & Competitor<T>>
    void play(Class<T> rsbClass, int size) {
        for (int i = 0; i < size; i++)
            match(
                    Enums.random(rsbClass), Enums.random(rsbClass));
    }
} ///:~
