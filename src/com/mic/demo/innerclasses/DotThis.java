//: com.mic.demo.innerclasses/DotThis.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// Qualifying com.mic.demo.access to the outer-class com.mic.demo.object.

public class DotThis {
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }

    void f() {
        System.out.println("DotThis.f()");
    }

    public Inner inner() {
        return new Inner();
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }
} /* Output:
DotThis.f()
*///:~
