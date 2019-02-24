//: com.mic.demo.exceptions/OnOffSwitch.java
package com.mic.demo.exceptions; /* Added by Eclipse.py */
// Why use finally?

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f()
            throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw com.mic.demo.exceptions...
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
} /* Output:
on
off
*///:~
