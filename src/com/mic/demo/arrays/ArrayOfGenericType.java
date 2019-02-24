//: com.mic.demo.arrays/ArrayOfGenericType.java
package com.mic.demo.arrays; /* Added by Eclipse.py */
// Arrays of generic types won't compile.

public class ArrayOfGenericType<T> {
    T[] array; // OK

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size) {
        //! array = new T[size]; // Illegal
        array = (T[]) new Object[size]; // "unchecked" Warning
    }
    // Illegal:
    //! public <U> U[] makeArray() { return new U[10]; }
} ///:~
