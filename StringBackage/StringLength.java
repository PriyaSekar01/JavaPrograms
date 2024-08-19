package StringBackage;

public class StringLength {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = 0;

        // Iterate through each character of the string
        // until we reach the end of the string
        while (length < str.length()) {
            length++;
        }

        System.out.println("Length of the string: " + length);
    }
}
