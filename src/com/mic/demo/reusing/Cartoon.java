//: com.mic.demo.reusing/Cartoon.java
package com.mic.demo.reusing; /* Added by Eclipse.py */
// Constructor calls during inheritance.

import static com.mic.demo.mindview.util.Print.print;

class Art {
    Art() {
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
