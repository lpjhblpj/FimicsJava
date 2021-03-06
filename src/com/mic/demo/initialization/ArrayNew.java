//: com.mic.demo.initialization/ArrayNew.java
package com.mic.demo.initialization; /* Added by Eclipse.py */
// Creating com.mic.demo.arrays with new.

import java.util.Arrays;
import java.util.Random;

import static com.mic.demo.mindview.util.Print.print;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        print("length of a = " + a.length);
        print(Arrays.toString(a));
    }
} /* Output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*///:~
