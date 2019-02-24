//: com.mic.demo.innerclasses/controller/Event.java
// The common methods for any com.mic.demo.control event.
package com.mic.demo.innerclasses.controller;

public abstract class Event {
    protected final long delayTime;
    private long eventTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() { // Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
} ///:~
