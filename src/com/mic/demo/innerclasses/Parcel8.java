//: com.mic.demo.innerclasses/Parcel8.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// Calling the base-class constructor.

public class Parcel8 {
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }

    public Wrapping wrapping(int x) {
        // Base constructor call:
        return new Wrapping(x) { // Pass constructor argument.
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }
} ///:~
