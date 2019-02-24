//: com.mic.demo.annotations/AtUnitExternalTest.java
// Creating non-embedded tests.
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.util.OSExecute;

public class AtUnitExternalTest extends AtUnitExample1 {
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit AtUnitExternalTest");
    }

    @Test
    boolean _methodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    boolean _methodTwo() {
        return methodTwo() == 2;
    }
} /* Output:
com.mic.demo.annotations.AtUnitExternalTest
  . _methodOne
  . _methodTwo This is methodTwo

OK (2 tests)
*///:~
