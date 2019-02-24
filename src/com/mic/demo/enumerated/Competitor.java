//: com.mic.demo.enumerated/Competitor.java
// Switching one enum on another.
package com.mic.demo.enumerated;

public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
} ///:~
