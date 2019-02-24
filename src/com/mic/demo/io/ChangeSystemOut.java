//: com.mic.demo.io/ChangeSystemOut.java
package com.mic.demo.io; /* Added by Eclipse.py */
// Turn System.out into a PrintWriter.

import java.io.PrintWriter;

public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world");
    }
} /* Output:
Hello, world
*///:~
