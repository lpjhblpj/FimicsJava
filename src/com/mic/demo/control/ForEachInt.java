//: com.mic.demo.control/ForEachInt.java
package com.mic.demo.control; /* Added by Eclipse.py */

import static com.mic.demo.mindview.util.Print.print;
import static com.mic.demo.mindview.util.Print.printnb;
import static com.mic.demo.mindview.util.Range.range;

public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10)) // 0..9
            printnb(i + " ");
        print();
        for (int i : range(5, 10)) // 5..9
            printnb(i + " ");
        print();
        for (int i : range(5, 20, 3)) // 5..20 step 3
            printnb(i + " ");
        print();
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
*///:~
