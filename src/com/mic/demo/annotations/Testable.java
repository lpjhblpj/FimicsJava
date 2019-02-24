//: com.mic.demo.annotations/Testable.java
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;

public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecute() {
        execute();
    }
} ///:~
