//: com.mic.demo.strings/Immutable.java
package com.mic.demo.strings; /* Added by Eclipse.py */

import static com.mic.demo.mindview.util.Print.print;

public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q); // howdy
        String qq = upcase(q);
        print(qq); // HOWDY
        print(q); // howdy
    }
} /* Output:
howdy
HOWDY
howdy
*///:~
