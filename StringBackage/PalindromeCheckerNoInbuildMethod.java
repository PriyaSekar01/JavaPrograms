package StringBackage;

import java.util.Scanner;

public class PalindromeCheckerNoInbuildMethod {

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();  // Convert string to char array
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the beginning and end of the array
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(charArray);
    }

    // Method to check if the string is a palindrome
    public static String isPalindrome(String str) {
        String rev = reverseString(str);  // Reverse the string manually
        if (str.equals(rev)) {
            return "It is a palindrome";
        } else {
            return "It is not a palindrome";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Word :");
        String str = s.nextLine();
        System.out.println(isPalindrome(str));
    }
}
