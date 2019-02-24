//: com.mic.demo.innerclasses/DotNew.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// Creating an inner class directly using the .new syntax.

public class DotNew {
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }

    public class Inner {
    }
} ///:~
