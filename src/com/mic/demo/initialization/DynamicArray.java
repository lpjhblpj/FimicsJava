//: com.mic.demo.initialization/DynamicArray.java
package com.mic.demo.initialization; /* Added by Eclipse.py */
// Array com.mic.demo.initialization.

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");
    }
} /* Output:
fiddle de dum
*///:~
