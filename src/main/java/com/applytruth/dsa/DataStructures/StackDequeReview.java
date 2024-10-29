package com.applytruth.dsa.DataStructures;

import java.util.Deque;
import java.util.ArrayDeque;

public class StackDequeReview {

    // Create default constructor
    public StackDequeReview() {
        System.out.println("StackDequeReview constructor");
    }

    public void ShowStack() {

        Deque<String> stack = new ArrayDeque<>();

        stack.push("first request");
        stack.push("second request");
        stack.push("third request");

        // Prints in LIFO order
        System.out.println(stack);

        System.out.println(stack.peek()); // Third request is on top of the stack
        stack.pop(); // Removes the top element
        System.out.println(stack); // Second request is on top of the stack

    }

    public void ShowQueue() {
        Deque<String> queue = new ArrayDeque<>();

        queue.add("first request");
        queue.add("second request");
        queue.add("third request");

        // Prints in FIFO order
        System.out.println(queue);

        System.out.println(queue.peek()); // First request is at the front of the queue
        queue.poll(); // Removes the front element
        System.out.println(queue); // Second request is at the front of the queue
    }

    public void run() {
        ShowStack();
        ShowQueue();
    }
}
