//: com.mic.demo.polymorphism/shape/Triangle.java
package com.mic.demo.polymorphism.shape;

import static com.mic.demo.mindview.util.Print.print;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
} ///:~
