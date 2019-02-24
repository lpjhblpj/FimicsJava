//: com.mic.demo.innerclasses/Parcel10.java
package com.mic.demo.innerclasses; /* Added by Eclipse.py */
// Using "instance com.mic.demo.initialization" to perform
// construction on an anonymous inner class.

public class Parcel10 {
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }

    public Destination
    destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            private String label = dest;

            // Instance com.mic.demo.initialization for each com.mic.demo.object:
            {
                cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Over budget!");
            }

            public String readLabel() {
                return label;
            }
        };
    }
} /* Output:
Over budget!
*///:~
