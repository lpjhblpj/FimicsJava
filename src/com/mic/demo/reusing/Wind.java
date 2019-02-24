//: com.mic.demo.reusing/Wind.java
package com.mic.demo.reusing; /* Added by Eclipse.py */
// Inheritance & upcasting.

class Instrument {
    static void tune(Instrument i) {
        // ...
        i.play();
    }

    public void play() {
    }
}

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
} ///:~