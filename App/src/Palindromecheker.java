import java.util.Stack;

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        // Test string
        String word = "racecar";

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Check palindrome
        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}

// PalindromeChecker class encapsulates palindrome logic
class PalindromeChecker {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String input) {

        // Internal stack to reverse characters
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare characters
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
