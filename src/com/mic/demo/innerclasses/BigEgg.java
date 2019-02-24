//: com.mic.demo.innerclasses/BigEgg.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// An inner class cannot be overriden like a method.

import static com.mic.demo.mindview.util.Print.print;

class Egg {
    private Yolk y;

    public Egg() {
        print("New Egg()");
        y = new Yolk();
    }

    protected class Yolk {
        public Yolk() {
            print("Egg.Yolk()");
        }
    }
}

public class BigEgg extends Egg {
    public static void main(String[] args) {
        new BigEgg();
    }

    public class Yolk {
        public Yolk() {
            print("BigEgg.Yolk()");
        }
    }
} /* Output:
New Egg()
Egg.Yolk()
*///:~