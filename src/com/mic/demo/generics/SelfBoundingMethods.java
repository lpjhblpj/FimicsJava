//: com.mic.demo.generics/SelfBoundingMethods.java
package com.mic.demo.generics; /* Added by Eclipse.py */

public class SelfBoundingMethods {
    static <T extends SelfBounded<T>> T f(T arg) {
        return arg.set(arg).get();
    }

    public static void main(String[] args) {
        A a = f(new A());
    }
} ///:~
