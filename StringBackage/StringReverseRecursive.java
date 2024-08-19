package StringBackage;

public class StringReverseRecursive {
        public static void main(String[] args) {
            String input = "java-w3wschools blog";
            printReverse(input, input.length() - 1);
        }

        private static void printReverse(String s, int pos) {
            if (pos > -1) {
                System.out.print(s.charAt(pos));
                printReverse(s, pos - 1);
            }
        }
}
