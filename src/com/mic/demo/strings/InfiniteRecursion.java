//: com.mic.demo.strings/InfiniteRecursion.java
package com.mic.demo.strings; /* Added by Eclipse.py */
// Accidental recursion.
// {RunByHand}

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }

    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }
} ///:~
