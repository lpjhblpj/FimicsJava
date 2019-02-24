//: com.mic.demo.strings/Rudolph.java
package com.mic.demo.strings; /* Added by Eclipse.py */

public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[]{"Rudolph",
                "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }
} /* Output:
true
true
true
true
*///:~
