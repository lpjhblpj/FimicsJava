//: com.mic.demo.annotations/database/Uniqueness.java
// Sample of nested com.mic.demo.annotations
package com.mic.demo.annotations.database;

public @interface Uniqueness {
    Constraints constraints()
            default @Constraints(unique = true);
} ///:~
