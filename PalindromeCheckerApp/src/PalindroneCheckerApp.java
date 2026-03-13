import java.util.*;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);     // enqueue
            stack.push(c);    // push
        }

        // Flag to track palindrome
        boolean isPalindrome = true;

        // Compare characters
        while (!queue.isEmpty()) {

            char qChar = queue.remove(); // dequeue
            char sChar = stack.pop();    // pop

            if (qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

