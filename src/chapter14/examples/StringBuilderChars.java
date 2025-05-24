package chapter14.examples;// Fig. 14.12: StringBuilderChars.java
// StringBuilder methods charAt, setCharAt, getChars and reverse.

public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello there");

        System.out.printf("buffer = %s%n", buffer.toString());

        // charAt(): get character at specific indices
        System.out.printf("Character at 0: %s%nCharacter at 4: %s%n%n",
                buffer.charAt(0), buffer.charAt(4));

        // getChars(): copy characters to char array
        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("The characters are: ");
        for (char character : charArray)
            System.out.print(character);

        // setCharAt(): modify characters at specific indices
        buffer.setCharAt(0, 'H');  // 'h' → 'H'
        buffer.setCharAt(6, 'T');  // 't' → 'T'
        System.out.printf("%n%nbuffer = %s", buffer.toString());

        // reverse(): reverse the entire string
        buffer.reverse();
        System.out.printf("%n%nbuffer = %s%n", buffer.toString());
    }
}
