import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String word = sc.nextLine();
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length-1;


        boolean isPalindrome = true;

        while(start<end){
            if(chars[start] != chars[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome){
            System.out.print("the given string is a palindrome");
        }else{
            System.out.print("the given string is not a palindrome");
        }
        sc.close();

    }
}
