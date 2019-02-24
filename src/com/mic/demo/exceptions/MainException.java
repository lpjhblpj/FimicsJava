//: com.mic.demo.exceptions/MainException.java
package com.mic.demo.exceptions; /* Added by Eclipse.py */

import java.io.FileInputStream;

public class MainException {
    // Pass all com.mic.demo.exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file =
                new FileInputStream("MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
} ///:~
