//: com.mic.demo.innerclasses/ClassInInterface.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// {main: ClassInInterface$Test}

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public static void main(String[] args) {
            new Test().howdy();
        }

        public void howdy() {
            System.out.println("Howdy!");
        }
    }
} /* Output:
Howdy!
*///:~
