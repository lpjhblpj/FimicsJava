//: com.mic.demo.io/OSExecuteDemo.java
package com.mic.demo.io; /* Added by Eclipse.py */
// Demonstrates standard I/O redirection.

import com.mic.demo.mindview.util.OSExecute;

public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap OSExecuteDemo");
    }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
