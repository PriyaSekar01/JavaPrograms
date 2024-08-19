package StringBackage;

import java.util.Scanner;

public class PalindromeChecker {
    public static String isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equals(rev)) {
            return "It is a palindrome";
        } else {
            return "It is not a palindrome";
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Word :");
        String str = s.nextLine();
        System.out.println(isPalindrome(str));
    }
}
