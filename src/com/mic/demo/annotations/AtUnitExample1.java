//: com.mic.demo.annotations/AtUnitExample1.java
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.util.OSExecute;

public class AtUnitExample1 {
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit AtUnitExample1");
    }

    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test
    boolean methodOneTest() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    boolean m2() {
        return methodTwo() == 2;
    }

    @Test
    private boolean m3() {
        return true;
    }

    // Shows output for failure:
    @Test
    boolean failureTest() {
        return false;
    }

    @Test
    boolean anotherDisappointment() {
        return false;
    }
} /* Output:
com.mic.demo.annotations.AtUnitExample1
  . methodOneTest
  . m2 This is methodTwo

  . m3
  . failureTest (failed)
  . anotherDisappointment (failed)
(5 tests)

>>> 2 FAILURES <<<
  com.mic.demo.annotations.AtUnitExample1: failureTest
  com.mic.demo.annotations.AtUnitExample1: anotherDisappointment
*///:~
