package StringBackage;

public class StringBuilderReverseString {
    public static void main(String[] args) {
        String str = "Main String to be reversed";
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        System.out.println("Reversed String : " + str);

    }

}
