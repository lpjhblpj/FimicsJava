//: com.mic.demo.strings/IntegerMatch.java
package com.mic.demo.strings; /* Added by Eclipse.py */

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
} /* Output:
true
true
false
true
*///:~