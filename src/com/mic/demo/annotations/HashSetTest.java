//: com.mic.demo.annotations/HashSetTest.java
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.util.OSExecute;

import java.util.HashSet;

public class HashSetTest {
    HashSet<String> testObject = new HashSet<String>();

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit HashSetTest");
    }

    @Test
    void initialization() {
        assert testObject.isEmpty();
    }

    @Test
    void _contains() {
        testObject.add("one");
        assert testObject.contains("one");
    }

    @Test
    void _remove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
    }
} /* Output:
com.mic.demo.annotations.HashSetTest
  . com.mic.demo.initialization
  . _remove
  . _contains
OK (3 tests)
*///:~
