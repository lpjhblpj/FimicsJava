//: com.mic.demo.io/xfiles/ThawAlien.java
package com.mic.demo.io.xfiles; /* Added by Eclipse.py */
// Try to recover a serialized file without the
// class of com.mic.demo.object that's stored in that file.
// {RunByHand}

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(new File("..", "X.file")));
        Object mystery = in.readObject();
        System.out.println(mystery.getClass());
    }
} /* Output:
class Alien
*///:~
