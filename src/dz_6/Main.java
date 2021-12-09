package dz_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            queue.offer(i);
        }

        System.out.print("Stack content: ");
        final int stackSize = stack.size();

        for (int i = 0; i < stackSize; i++) {
            System.out.print(stack.pop() + ", ");
        }

        System.out.print("\nStack content after cycle: " + stack);

        System.out.print("\nQueue content: ");
        final int queueSize = queue.size();

        for (int i = 0; i < queueSize; i++) {
            System.out.print(queue.poll() + ", ");
        }
        
        System.out.print("\nQueue content after cycle: " + queue);
    }
}
