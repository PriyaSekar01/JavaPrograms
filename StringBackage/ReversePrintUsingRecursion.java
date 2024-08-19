package StringBackage;

public class ReversePrintUsingRecursion {
    public static void printNumbersReverse(int n) {
        if (n > 0) {
            System.out.println(n);
            printNumbersReverse(n - 1);
        }
    }

    public static void main(String[] args) {
        int limit = 5;
        System.out.println("Printing the first 5 numbers in reverse order using recursion:");
        printNumbersReverse(limit);
    }
}
