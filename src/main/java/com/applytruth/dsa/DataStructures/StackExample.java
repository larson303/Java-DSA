import java.util.Deque;
import java.util.ArrayDeque;

public class StackExample {

    public static void main(String[] args) {

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
}
