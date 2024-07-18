/**
 * The `OverrideMain` class demonstrates how to override the `main` method in Java.
 * 
 * The `main` method is the entry point of a Java application. This class shows how to
 * define an additional `main` method that can be called from the default `main` method.
 * 
 * When the `OverrideMain` class is executed, it will first print "Hello World from main",
 * and then call the overridden `main` method, which will print "Hello World from override".
 * 
 * @author Abhi Tiwari
 */
package oops;

class OverrideMain {
    /**
     * Calls the overridden `main` method to print a message.
     */
    public static void main(String[] args) {
        System.out.println("Hello World from main");
        OverrideMain.main();
    }

    /**
     * Overrides the main method to print a message.
     */
    public static void main() {
        System.out.println("Hello World from override");
    }
}