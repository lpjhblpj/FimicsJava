//: com.mic.demo.typeinfo/toys/ToyTest.java
// Testing class Class.
package com.mic.demo.typeinfo.toys;

import static com.mic.demo.mindview.util.Print.print;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.mic.demo.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Cannot com.mic.demo.access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
} /* Output:
Class name: com.mic.demo.typeinfo.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : com.mic.demo.typeinfo.toys.FancyToy
Class name: com.mic.demo.typeinfo.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : com.mic.demo.typeinfo.toys.HasBatteries
Class name: com.mic.demo.typeinfo.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : com.mic.demo.typeinfo.toys.Waterproof
Class name: com.mic.demo.typeinfo.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : com.mic.demo.typeinfo.toys.Shoots
Class name: com.mic.demo.typeinfo.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : com.mic.demo.typeinfo.toys.Toy
*///:~
