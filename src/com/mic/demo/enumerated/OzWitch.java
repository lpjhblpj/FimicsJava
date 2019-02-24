//: com.mic.demo.enumerated/OzWitch.java
package com.mic.demo.enumerated; /* Added by Eclipse.py */
// The witches in the land of Oz.

import static com.mic.demo.mindview.util.Print.print;

public enum OzWitch {
    // Instances must be defined first, before methods:
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby " +
            "Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");
    private String description;

    // Constructor must be package or private com.mic.demo.access:
    private OzWitch(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values())
            print(witch + ": " + witch.getDescription());
    }

    public String getDescription() {
        return description;
    }
} /* Output:
WEST: Miss Gulch, aka the Wicked Witch of the West
NORTH: Glinda, the Good Witch of the North
EAST: Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house
SOUTH: Good by inference, but missing
*///:~
