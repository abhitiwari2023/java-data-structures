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
    static class Stacks{
        static int[] stack = new int[10];
        static int top = -1;

        //is empty
        public static boolean isEmpty(){
            return top == -1;
        }

        //push
        public static void push(int x){
            stack[++top] = x;
        }

        //pop
        public static int pop(){
            return stack[top--];
        }

        //peek
        public static int peek(){
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
