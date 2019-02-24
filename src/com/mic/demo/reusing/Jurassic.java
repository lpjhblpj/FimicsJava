//: com.mic.demo.reusing/Jurassic.java
package com.mic.demo.reusing; /* Added by Eclipse.py */
// Making an entire class final.

class SmallBrain {
}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {
    }
}

//! class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
} ///:~
