//: com.mic.demo.annotations/AtUnitExample5.java
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.atunit.TestObjectCleanup;
import com.mic.demo.mindview.atunit.TestObjectCreate;
import com.mic.demo.mindview.atunit.TestProperty;
import com.mic.demo.mindview.util.OSExecute;

import java.io.IOException;
import java.io.PrintWriter;

public class AtUnitExample5 {
    @TestProperty
    static PrintWriter output;
    @TestProperty
    static int counter;
    private String text;

    public AtUnitExample5(String text) {
        this.text = text;
    }

    @TestObjectCreate
    static AtUnitExample5 create() {
        String id = Integer.toString(counter++);
        try {
            output = new PrintWriter("Test" + id + ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new AtUnitExample5(id);
    }

    @TestObjectCleanup
    static void
    cleanup(AtUnitExample5 tobj) {
        System.out.println("Running cleanup");
        output.close();
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit AtUnitExample5");
    }

    public String toString() {
        return text;
    }

    @Test
    boolean test1() {
        output.print("test1");
        return true;
    }

    @Test
    boolean test2() {
        output.print("test2");
        return true;
    }

    @Test
    boolean test3() {
        output.print("test3");
        return true;
    }
} /* Output:
com.mic.demo.annotations.AtUnitExample5
  . test1
Running cleanup
  . test2
Running cleanup
  . test3
Running cleanup
OK (3 tests)
*///:~
