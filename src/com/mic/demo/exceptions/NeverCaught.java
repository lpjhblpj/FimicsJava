//: com.mic.demo.exceptions/NeverCaught.java
package com.mic.demo.exceptions; /* Added by Eclipse.py */
// Ignoring RuntimeExceptions.
// {ThrowsException}

public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
} ///:~
