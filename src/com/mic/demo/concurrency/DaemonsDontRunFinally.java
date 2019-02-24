//: com.mic.demo.concurrency/DaemonsDontRunFinally.java
package com.mic.demo.concurrency; /* Added by Eclipse.py */
// Daemon threads don't run the finally clause

import java.util.concurrent.TimeUnit;

import static com.mic.demo.mindview.util.Print.print;

class ADaemon implements Runnable {
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            print("Exiting via InterruptedException");
        } finally {
            print("This should always run?");
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
} /* Output:
Starting ADaemon
*///:~
