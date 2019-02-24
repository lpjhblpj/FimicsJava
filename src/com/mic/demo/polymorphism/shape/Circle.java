//: com.mic.demo.polymorphism/shape/Circle.java
package com.mic.demo.polymorphism.shape;

import static com.mic.demo.mindview.util.Print.print;

public class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        print("Circle.erase()");
    }
} ///:~
