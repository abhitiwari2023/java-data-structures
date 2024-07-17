package stack;

import java.util.ArrayList;

public class StacksArrayList {
    /**
     * Provides a simple stack implementation using an ArrayList.
     * The stack supports pushing, popping, peeking, and checking if it is empty.
     * 
     * @author Abhishek Tiwari
     * @version 1.0
     * @since 2024-07-06
     * @see https://github.com/abhitiwari2023/java-data-structures
     */
    public static class Stack {
        // The underlying ArrayList that stores the stack elements
        static ArrayList<Integer> stack = new ArrayList<Integer>();
    
        /**
         * Pushes a new element onto the stack.
         * @param x the element to be pushed onto the stack
         */
        public static void push(int x) {
            stack.add(x);
        }
    
        /**
         * Removes and returns the top element from the stack.
         * @return the top element that was removed from the stack
         */
        public static int pop() {
            int x = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return x;
        }
    
        /**
         * Returns the top element of the stack without removing it.
         * @return the top element of the stack
         */
        public static int peek() {
            return stack.get(stack.size() - 1);
        }
    
        /**
         * Checks if the stack is empty.
         * @return true if the stack is empty, false otherwise
         */
        public static boolean isEmpty() {
            return stack.size() == 0;
        }
    }
    /**
     * Demonstrates the usage of the Stack class, including pushing and popping elements,
     * peeking at the top element, and checking if the stack is empty.
     */
    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        System.out.println(Stack.peek());
        System.out.println(Stack.pop());
        System.out.println(Stack.peek());

        //check for empty
        System.out.println(Stack.isEmpty());
    }
}
