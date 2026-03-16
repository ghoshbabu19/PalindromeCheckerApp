import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Using String Reverse
    public static boolean reverseMethod(String input) {

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);

    }

    // Method 2: Using Two Pointer Technique
    public static boolean twoPointerMethod(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Method 3: Using Stack
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Reverse Method Performance
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Two Pointer Method Performance
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Stack Method Performance
        long start3 = System.nanoTime();
        boolean result3 = stackMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\nPalindrome Results:");
        System.out.println("Reverse Method: " + result1);
        System.out.println("Two Pointer Method: " + result2);
        System.out.println("Stack Method: " + result3);

        System.out.println("\nExecution Time (in nanoseconds):");
        System.out.println("Reverse Method Time: " + time1);
        System.out.println("Two Pointer Method Time: " + time2);
        System.out.println("Stack Method Time: " + time3);

        sc.close();
    }
}
