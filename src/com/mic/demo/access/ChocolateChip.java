//: com.mic.demo.access/ChocolateChip.java
package com.mic.demo.access; /* Added by Eclipse.py */
// Can't use package-com.mic.demo.access member from another package.

import com.mic.demo.access.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }

    public void chomp() {
        //! bite(); // Can't com.mic.demo.access bite
    }
} /* Output:
Cookie constructor
ChocolateChip constructor
*///:~
