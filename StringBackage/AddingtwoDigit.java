package StringBackage;

import java.util.Scanner;

public class AddingtwoDigit {

    static int addDigits(int digit, int number) {
        String numberString = Integer.toString(number);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            int digitValue = Character.getNumericValue(numberString.charAt(i));
            int newDigitValue = digitValue + digit;
            sb.append(newDigitValue);
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a digit:");
        int digit = s.nextInt();
        System.out.println("Enter a number:");
        int number = s.nextInt();
        int result = addDigits(digit, number);
        System.out.println("Result: " + result);
    }
}