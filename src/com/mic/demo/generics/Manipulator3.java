//: com.mic.demo.generics/Manipulator3.java
package com.mic.demo.generics; /* Added by Eclipse.py */

class Manipulator3 {
    private HasF obj;

    public Manipulator3(HasF x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
} ///:~
