//: com.mic.demo.generics/GenericHolder.java
package com.mic.demo.generics; /* Added by Eclipse.py */

public class GenericHolder<T> {
    private T obj;

    public static void main(String[] args) {
        GenericHolder<String> holder =
                new GenericHolder<String>();
        holder.set("Item");
        String s = holder.get();
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
} ///:~