//: com.mic.demo.concurrency/Fat.java
package com.mic.demo.concurrency; /* Added by Eclipse.py */
// Objects that are expensive to create.

public class Fat {
    private static int counter = 0;
    private final int id = counter++;
    private volatile double d; // Prevent optimization

    public Fat() {
        // Expensive, interruptible operation:
        for (int i = 1; i < 10000; i++) {
            d += (Math.PI + Math.E) / (double) i;
        }
    }

    public void operation() {
        System.out.println(this);
    }

    public String toString() {
        return "Fat id: " + id;
    }
} ///:~