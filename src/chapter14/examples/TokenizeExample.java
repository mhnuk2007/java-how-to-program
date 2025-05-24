package chapter14.examples;

public class TokenizeExample {
    public static void main(String[] args) {
        String text = "Java,is,a,popular,programming,language";

        // Split by comma
        String[] tokens = text.split(",");

        // Print all tokens
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
