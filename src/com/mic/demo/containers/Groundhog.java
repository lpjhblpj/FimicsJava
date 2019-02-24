//: com.mic.demo.containers/Groundhog.java
package com.mic.demo.containers; /* Added by Eclipse.py */
// Looks plausible, but doesn't work as a HashMap key.

public class Groundhog {
    protected int number;

    public Groundhog(int n) {
        number = n;
    }

    public String toString() {
        return "Groundhog #" + number;
    }
} ///:~
