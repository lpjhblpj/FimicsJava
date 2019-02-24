//: com.mic.demo.polymorphism/PrivateOverride.java
// Trying to override a private method.
package com.mic.demo.polymorphism;

import static com.mic.demo.mindview.util.Print.print;

public class PrivateOverride {
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

    private void f() {
        print("private f()");
    }
}

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
} /* Output:
private f()
*///:~
