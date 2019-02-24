//: com.mic.demo.annotations/AtUnitExample2.java
// Assertions and com.mic.demo.exceptions can be used in @Tests.
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.util.OSExecute;

import java.io.FileInputStream;
import java.io.IOException;

public class AtUnitExample2 {
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit AtUnitExample2");
    }

    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test
    void assertExample() {
        assert methodOne().equals("This is methodOne");
    }

    @Test
    void assertFailureExample() {
        assert 1 == 2 : "What a surprise!";
    }

    @Test
    void exceptionExample() throws IOException {
        new FileInputStream("nofile.txt"); // Throws
    }

    @Test
    boolean assertAndReturn() {
        // Assertion with message:
        assert methodTwo() == 2 : "methodTwo must equal 2";
        return methodOne().equals("This is methodOne");
    }
} /* Output:
com.mic.demo.annotations.AtUnitExample2
  . assertExample
  . assertFailureExample java.lang.AssertionError: What a surprise!
(failed)
  . exceptionExample java.com.mic.demo.io.FileNotFoundException: nofile.txt (The system cannot find the file specified)
(failed)
  . assertAndReturn This is methodTwo

(4 tests)

>>> 2 FAILURES <<<
  com.mic.demo.annotations.AtUnitExample2: assertFailureExample
  com.mic.demo.annotations.AtUnitExample2: exceptionExample
*///:~
