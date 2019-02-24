//: com.mic.demo.polymorphism/shape/Square.java
package com.mic.demo.polymorphism.shape;

import static com.mic.demo.mindview.util.Print.print;

public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
} ///:~
