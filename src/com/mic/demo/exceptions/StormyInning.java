//: com.mic.demo.exceptions/StormyInning.java
package com.mic.demo.exceptions; /* Added by Eclipse.py */
// Overridden methods may throw only the com.mic.demo.exceptions
// specified in their base-class versions, or com.mic.demo.exceptions
// derived from the base-class com.mic.demo.exceptions.

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked com.mic.demo.exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

public class StormyInning extends Inning implements Storm {
    // OK to add new com.mic.demo.exceptions for constructors, but you
    // must deal with the base constructor com.mic.demo.exceptions:
    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the com.mic.demo.exceptions from the
            // base-class version of the method:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }

    // Regular methods must conform to base class:
//! void walk() throws PopFoul {} //Compile error
    // Interface CANNOT add com.mic.demo.exceptions to existing
    // methods from the base class:
//! public void event() throws RainedOut {}
    // If the method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {
    }

    // You can choose to not throw any com.mic.demo.exceptions,
    // even if the base version does:
    public void event() {
    }

    // Overridden methods can throw inherited com.mic.demo.exceptions:
    public void atBat() throws PopFoul {
    }
} ///:~
