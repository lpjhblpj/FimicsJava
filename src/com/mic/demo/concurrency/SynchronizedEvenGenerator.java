//: com.mic.demo.concurrency/SynchronizedEvenGenerator.java
package com.mic.demo.concurrency; /* Added by Eclipse.py */
// Simplifying mutexes with the synchronized keyword.
// {RunByHand}

public class
        SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }

    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield(); // Cause failure faster
        ++currentEvenValue;
        return currentEvenValue;
    }
} ///:~
