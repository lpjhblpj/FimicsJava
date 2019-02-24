//: com.mic.demo.typeinfo/GenericClassReferences.java
package com.mic.demo.typeinfo; /* Added by Eclipse.py */

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
} ///:~
