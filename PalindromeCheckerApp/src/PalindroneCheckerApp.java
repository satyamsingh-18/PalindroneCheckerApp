import java.util.*;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag for palindrome
        boolean isPalindrome = true;

        // Compare first and last characters
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

