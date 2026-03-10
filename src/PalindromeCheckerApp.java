public class PalindromeCheckerApp {
    static class PalindromeService {
        public boolean checkPalindrome(String input) {
            int start = 0;
            int end = input.length() - 1;
            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
    public static void main(String[] args) {

        String input = "racecar";
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}