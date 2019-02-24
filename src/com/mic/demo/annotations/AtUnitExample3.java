//: com.mic.demo.annotations/AtUnitExample3.java
package com.mic.demo.annotations;

import com.mic.demo.mindview.atunit.Test;
import com.mic.demo.mindview.atunit.TestObjectCreate;
import com.mic.demo.mindview.util.OSExecute;

public class AtUnitExample3 {
    private int n;

    public AtUnitExample3(int n) {
        this.n = n;
    }

    @TestObjectCreate
    static AtUnitExample3 create() {
        return new AtUnitExample3(47);
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command(
                "java com.mic.demo.mindview.atunit.AtUnit AtUnitExample3");
    }

    public int getN() {
        return n;
    }

    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test
    boolean initialization() {
        return n == 47;
    }

    @Test
    boolean methodOneTest() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    boolean m2() {
        return methodTwo() == 2;
    }
} /* Output:
com.mic.demo.annotations.AtUnitExample3
  . com.mic.demo.initialization
  . methodOneTest
  . m2 This is methodTwo

OK (3 tests)
*///:~
