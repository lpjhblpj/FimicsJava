//: com.mic.demo.interfaces/filters/Waveform.java
package com.mic.demo.interfaces.filters;

public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
} ///:~
