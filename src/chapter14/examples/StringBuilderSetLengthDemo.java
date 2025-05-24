package chapter14.examples;

public class StringBuilderSetLengthDemo {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Short");

        System.out.printf("Before setLength: \"%s\" (length = %d)%n", buffer, buffer.length());

        buffer.setLength(10); // pads with '\u0000'
        System.out.printf("After setLength(10): \"%s\" (length = %d)%n", buffer, buffer.length());

        System.out.println("Individual characters:");
        for (int i = 0; i < buffer.length(); i++) {
            System.out.printf("char[%d] = '%s'%n", i, buffer.charAt(i) == '\u0000' ? "\\u0000" : buffer.charAt(i));
        }
    }
}
