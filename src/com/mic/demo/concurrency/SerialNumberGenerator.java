//: com.mic.demo.concurrency/SerialNumberGenerator.java
package com.mic.demo.concurrency; /* Added by Eclipse.py */

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++; // Not thread-safe
    }
} ///:~
