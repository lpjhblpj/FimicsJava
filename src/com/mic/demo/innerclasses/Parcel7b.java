//: com.mic.demo.innerclasses/Parcel7b.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// Expanded version of Parcel7.java

public class Parcel7b {
    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }

    public Contents contents() {
        return new MyContents();
    }

    class MyContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }
} ///:~
