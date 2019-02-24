//: com.mic.demo.annotations/AtUnitComposition.java
// Creating non-embedded tests.
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.util.OSExecute;

public class AtUnitComposition {
    AtUnitExample1 testObject = new AtUnitExample1();

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit AtUnitComposition");
    }

    @Test
    boolean _methodOne() {
        return
                testObject.methodOne().equals("This is methodOne");
    }

    @Test
    boolean _methodTwo() {
        return testObject.methodTwo() == 2;
    }
} /* Output:
com.mic.demo.annotations.AtUnitComposition
  . _methodOne
  . _methodTwo This is methodTwo

OK (2 tests)
*///:~
