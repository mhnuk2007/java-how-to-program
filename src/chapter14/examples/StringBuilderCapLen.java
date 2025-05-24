package chapter14.examples;// Fig. 14.11: StringBuilderCapLen.java
// Demonstrates StringBuilder methods: length, setLength, capacity, and ensureCapacity.

public class StringBuilderCapLen {
    public static void main(String[] args) {
        // Create a StringBuilder with initial content
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        // Display initial buffer, length, and capacity
        System.out.printf("buffer = \"%s\"%nlength = %d%ncapacity = %d%n%n",
                buffer.toString(), buffer.length(), buffer.capacity());

        // Ensure capacity is at least 75
        buffer.ensureCapacity(75);
        System.out.printf("New capacity after ensureCapacity(75) = %d%n%n", buffer.capacity());

        // Set the length to 10 (truncates the content)
        buffer.setLength(10);
        System.out.printf("New length = %d%nbuffer = \"%s\"%n",
                buffer.length(), buffer.toString());
    }
}
