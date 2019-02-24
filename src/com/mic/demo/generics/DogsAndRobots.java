//: com.mic.demo.generics/DogsAndRobots.java
package com.mic.demo.generics; /* Added by Eclipse.py */
// No latent typing in Java

import com.mic.demo.typeinfo.pets.Dog;

import static com.mic.demo.mindview.util.Print.print;

class PerformingDog extends Dog implements Performs {
    public void speak() {
        print("Woof!");
    }

    public void sit() {
        print("Sitting");
    }

    public void reproduce() {
    }
}

class Robot implements Performs {
    public void speak() {
        print("Click!");
    }

    public void sit() {
        print("Clank!");
    }

    public void oilChange() {
    }
}

class Communicate {
    public static <T extends Performs>
    void perform(T performer) {
        performer.speak();
        performer.sit();
    }
}

public class DogsAndRobots {
    public static void main(String[] args) {
        PerformingDog d = new PerformingDog();
        Robot r = new Robot();
        Communicate.perform(d);
        Communicate.perform(r);
    }
} /* Output:
Woof!
Sitting
Click!
Clank!
*///:~
