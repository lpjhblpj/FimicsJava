//: com.mic.demo.object/ShowProperties.java
package com.mic.demo.object; /* Added by Eclipse.py */

public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path"));
    }
} ///:~
