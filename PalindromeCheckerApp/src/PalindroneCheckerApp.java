import java.util.*;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "level";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome
        boolean isPalindrome = true;

        // Compare first and last characters
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}