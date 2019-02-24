//: com.mic.demo.exceptions/WithFinally.java
package com.mic.demo.exceptions; /* Added by Eclipse.py */
// Finally Guarantees cleanup.

public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw com.mic.demo.exceptions...
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
} /* Output:
on
off
*///:~
