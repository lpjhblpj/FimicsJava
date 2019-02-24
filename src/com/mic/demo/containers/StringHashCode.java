//: com.mic.demo.containers/StringHashCode.java
package com.mic.demo.containers; /* Added by Eclipse.py */

public class StringHashCode {
    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
    }
} /* Output: (Sample)
69609650
69609650
*///:~
