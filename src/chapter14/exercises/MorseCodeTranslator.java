package chapter14.exercises;

import java.util.*;

public class MorseCodeTranslator {
    private static final Map<Character, String> charToMorse = new HashMap<>();
    private static final Map<String, Character> morseToChar = new HashMap<>();

    static {
        // Initialize charToMorse map
        charToMorse.put('A', ".-");
        charToMorse.put('B', "-...");
        charToMorse.put('C', "-.-.");
        charToMorse.put('D', "-..");
        charToMorse.put('E', ".");
        charToMorse.put('F', "..-.");
        charToMorse.put('G', "--.");
        charToMorse.put('H', "....");
        charToMorse.put('I', "..");
        charToMorse.put('J', ".---");
        charToMorse.put('K', "-.-");
        charToMorse.put('L', ".-..");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-.");
        charToMorse.put('O', "---");
        charToMorse.put('P', ".--.");
        charToMorse.put('Q', "--.-");
        charToMorse.put('R', ".-.");
        charToMorse.put('S', "...");
        charToMorse.put('T', "-");
        charToMorse.put('U', "..-");
        charToMorse.put('V', "...-");
        charToMorse.put('W', ".--");
        charToMorse.put('X', "-..-");
        charToMorse.put('Y', "-.--");
        charToMorse.put('Z', "--..");
        // digits
        charToMorse.put('1', ".----");
        charToMorse.put('2', "..---");
        charToMorse.put('3', "...--");
        charToMorse.put('4', "....-");
        charToMorse.put('5', ".....");
        charToMorse.put('6', "-....");
        charToMorse.put('7', "--...");
        charToMorse.put('8', "---..");
        charToMorse.put('9', "----.");
        charToMorse.put('0', "-----");
        // Add punctuation if desired

        // Build reverse map
        for (Map.Entry<Character, String> entry : charToMorse.entrySet()) {
            morseToChar.put(entry.getValue(), entry.getKey());
        }
    }

    public static String encodeToMorse(String text) {
        StringBuilder morse = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                morse.append("   "); // 3 spaces between words
            } else {
                String code = charToMorse.get(c);
                if (code != null) {
                    morse.append(code).append(' '); // 1 space between letters
                }
                // else ignore unknown chars
            }
        }
        return morse.toString().trim();
    }

    public static String decodeFromMorse(String morseCode) {
        StringBuilder text = new StringBuilder();
        String[] words = morseCode.trim().split(" {3}"); // split by 3 spaces

        for (int w = 0; w < words.length; w++) {
            String[] letters = words[w].split(" ");
            for (String letter : letters) {
                Character ch = morseToChar.get(letter);
                if (ch != null) {
                    text.append(ch);
                }
            }
            if (w < words.length - 1) {
                text.append(' ');
            }
        }
        return text.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to encode English to Morse or 2 to decode Morse to English:");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            System.out.println("Enter English phrase:");
            String input = sc.nextLine();
            System.out.println("Morse Code:");
            System.out.println(encodeToMorse(input));
        } else if (choice == 2) {
            System.out.println("Enter Morse code (letters separated by one space, words by three spaces):");
            String input = sc.nextLine();
            System.out.println("English Text:");
            System.out.println(decodeFromMorse(input));
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
