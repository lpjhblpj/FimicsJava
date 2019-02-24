//: com.mic.demo.exceptions/Switch.java
package com.mic.demo.exceptions; /* Added by Eclipse.py */

import static com.mic.demo.mindview.util.Print.print;

public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        print(this);
    }

    public void off() {
        state = false;
        print(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }
} ///:~
