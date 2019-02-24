//: com.mic.demo.concurrency/SyncObject.java
package com.mic.demo.concurrency; /* Added by Eclipse.py */
// Synchronizing on another com.mic.demo.object.

import static com.mic.demo.mindview.util.Print.print;

class DualSynch {
    private Object syncObject = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            print("f()");
            Thread.yield();
        }
    }

    public void g() {
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                print("g()");
                Thread.yield();
            }
        }
    }
}

public class SyncObject {
    public static void main(String[] args) {
        final DualSynch ds = new DualSynch();
        new Thread() {
            public void run() {
                ds.f();
            }
        }.start();
        ds.g();
    }
} /* Output: (Sample)
g()
f()
g()
f()
g()
f()
g()
f()
g()
f()
*///:~