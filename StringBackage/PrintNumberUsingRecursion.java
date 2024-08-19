package StringBackage;

public class PrintNumberUsingRecursion {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int limit = 5; // The limit for the first 5 numbers
        System.out.println("Printing the first 5 numbers using recursion:");
        printNumbers(limit);
    }
}
