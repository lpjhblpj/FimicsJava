//: com.mic.demo.enumerated/SpaceShip.java
package com.mic.demo.enumerated; /* Added by Eclipse.py */

public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    public static void main(String[] args) {
        for (SpaceShip s : values()) {
            System.out.println(s);
        }
    }

    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
} /* Output:
Scout
Cargo
Transport
Cruiser
Battleship
Mothership
*///:~