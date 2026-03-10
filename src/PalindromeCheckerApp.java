import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string :");
        String word = sc.nextLine();
        String reversed = "";
        for(int i = word.length()-1;i>=0;i--){
            reversed = reversed + word.charAt(i);
        }
        if(word.equals(reversed)){
            System.out.print("the given string is a palindrome");
        }else{
            System.out.print("the given string is not a palindrome");
        }
        sc.close();

    }
}
