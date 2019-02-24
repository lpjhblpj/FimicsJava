//: com.mic.demo.interfaces/interfaceprocessor/Apply.java
package com.mic.demo.interfaces.interfaceprocessor;

import static com.mic.demo.mindview.util.Print.print;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
} ///:~
