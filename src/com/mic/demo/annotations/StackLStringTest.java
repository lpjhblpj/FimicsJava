//: com.mic.demo.annotations/StackLStringTest.java
// Applying @Unit to com.mic.demo.generics.
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.util.OSExecute;

public class StackLStringTest extends StackL<String> {
    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit StackLStringTest");
    }

    @Test
    void _push() {
        push("one");
        assert top().equals("one");
        push("two");
        assert top().equals("two");
    }

    @Test
    void _pop() {
        push("one");
        push("two");
        assert pop().equals("two");
        assert pop().equals("one");
    }

    @Test
    void _top() {
        push("A");
        push("B");
        assert top().equals("B");
        assert top().equals("B");
    }
} /* Output:
com.mic.demo.annotations.StackLStringTest
  . _push
  . _pop
  . _top
OK (3 tests)
*///:~
