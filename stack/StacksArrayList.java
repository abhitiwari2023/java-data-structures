package stack;

import java.util.ArrayList;

public class StacksArrayList {
    public static class Stack {
        static ArrayList<Integer> stack = new ArrayList<Integer>();

        // Push a new element onto the stack
        public static void push(int x) {
            stack.add(x);
        }

        // Pop the top element off the stack
        public static int pop() {
            int x = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return x;
        }

        // Return the top element of the stack
        public static int peek() {
            return stack.get(stack.size() - 1);
        }

        // is empty
        public static boolean isEmpty() {
            return stack.size() == 0;
        }

    }
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
