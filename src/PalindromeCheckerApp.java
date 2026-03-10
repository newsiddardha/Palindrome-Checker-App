public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long startTime = System.nanoTime();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean isPalindrome = input.equals(reversed);

        long endTime = System.nanoTime();

        System.out.println("Input String: " + input);
        System.out.println("Palindrome Result: " + isPalindrome);
        System.out.println("Execution Time (Reverse Method): " + (endTime - startTime) + " ns");
    }
}