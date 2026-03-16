public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String text = "Madam In Eden Im Adam";

        // Normalize the string: remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using two-pointer technique
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("\"" + text + "\" is not a Palindrome");
        }
    }
}
