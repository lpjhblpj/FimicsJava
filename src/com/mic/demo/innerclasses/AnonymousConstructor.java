//: com.mic.demo.innerclasses/AnonymousConstructor.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// Creating a constructor for an anonymous inner class.

import static com.mic.demo.mindview.util.Print.print;

abstract class Base {
    public Base(int i) {
        print("Base constructor, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                print("Inside instance initializer");
            }

            public void f() {
                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
} /* Output:
Base constructor, i = 47
Inside instance initializer
In anonymous f()
*///:~