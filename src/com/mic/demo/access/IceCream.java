//: com.mic.demo.access/IceCream.java
package com.mic.demo.access; /* Added by Eclipse.py */
// Demonstrates "private" keyword.

class Sundae {
    private Sundae() {
    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //! Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
} ///:~
