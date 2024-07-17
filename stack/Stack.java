package stack;

/**
 * Provides a simple stack implementation with push, pop, and peek operations.
 * The stack has a fixed size of 10 elements.
 * 
 * @author Abhishek Tiwari
 * @version 1.0
 * @since 2024-07-06
 * @see https://github.com/abhitiwari2023/java-data-structures
 */
public class Stack {
    static class Stacks {
        /**
         * The array that stores the elements of the stack.
         */
        static int[] stack = new int[10];
    
        /**
         * The index of the top element in the stack.
         */
        static int top = -1;
    
        /**
         * Checks if the stack is empty.
         * @return true if the stack is empty, false otherwise.
         */
        public static boolean isEmpty() {
            return top == -1;
        }
    
        /**
         * Pushes an element onto the stack.
         * @param x the element to be pushed.
         */
        public static void push(int x) {
            stack[++top] = x;
        }
    
        /**
         * Removes and returns the top element from the stack.
         * @return the top element of the stack.
         */
        public static int pop() {
            return stack[top--];
        }
    
        /**
         * Returns the top element of the stack without removing it.
         * @return the top element of the stack.
         */
        public static int peek() {
            return stack[top];
        }
    }
     
    public static void main(String[] args) {
        Stacks.push(1);
        Stacks.push(2);
        Stacks.push(3);
        Stacks.push(4);
        System.out.println(Stacks.peek());
        System.out.println(Stacks.pop());
        System.out.println(Stacks.peek());

        //check for empty
        System.out.println(Stacks.isEmpty());
    }
}
