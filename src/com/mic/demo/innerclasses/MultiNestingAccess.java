//: com.mic.demo.innerclasses/MultiNestingAccess.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// Nested classes can com.mic.demo.access all members of all
// levels of the classes they are nested within.

class MNA {
    private void f() {
    }

    class A {
        private void g() {
        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
} ///:~
