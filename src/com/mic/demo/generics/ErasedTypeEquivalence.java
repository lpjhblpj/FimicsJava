//: com.mic.demo.generics/ErasedTypeEquivalence.java
package com.mic.demo.generics; /* Added by Eclipse.py */

import java.util.ArrayList;

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
} /* Output:
true
*///:~
