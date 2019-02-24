//: com.mic.demo.access/Lunch.java
package com.mic.demo.access; /* Added by Eclipse.py */
// Demonstrates class com.mic.demo.access specifiers. Make a class
// effectively private with private constructors:

class Soup1 {
    private Soup1() {
    }

    // (1) Allow creation via static method:
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    // (2) Create a static com.mic.demo.object and return a reference
    // upon request.(The "Singleton" pattern):
    private static Soup2 ps1 = new Soup2();

    private Soup2() {
    }

    public static Soup2 access() {
        return ps1;
    }

    public void f() {
    }
}

// Only one public class allowed per file:
public class Lunch {
    void testPrivate() {
        // Can't do this! Private constructor:
        //! Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
} ///:~
