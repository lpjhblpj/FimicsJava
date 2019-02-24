//: com.mic.demo.reusing/SpaceShip.java
package com.mic.demo.reusing; /* Added by Eclipse.py */

public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }

    public String toString() {
        return name;
    }
} ///:~
