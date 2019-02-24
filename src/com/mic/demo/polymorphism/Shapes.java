//: com.mic.demo.polymorphism/Shapes.java
package com.mic.demo.polymorphism; /* Added by Eclipse.py */
// Polymorphism in Java.

import com.mic.demo.polymorphism.shape.RandomShapeGenerator;
import com.mic.demo.polymorphism.shape.Shape;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for (Shape shp : s)
            shp.draw();
    }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
