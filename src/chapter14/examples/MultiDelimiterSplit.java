package chapter14.examples;

public class MultiDelimiterSplit {
    public static void main(String[] args) {
        String text = "Java, is; a popular programming language";

        // Split by comma, semicolon or space (one or more)
        String[] tokens = text.split("[,; ]+");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
