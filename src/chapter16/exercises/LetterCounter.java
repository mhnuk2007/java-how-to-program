package chapter16.exercises;
/*
16.14 (Counting Letters) Modify the program of Fig. 16.18 to count the number of
occurrences of each letter rather than of each word. For example, the string
"HELLO THERE" contains two Hs, three Es, two Ls, one O, one T and one R. Display the results.
 */

// Modified version of Fig. 16.18 to count letters instead of words

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        // Create HashMap to store Character keys and Integer values
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap);   // Create map based on user input
        displayMap(myMap);  // Display map content
    }

    // Create map from user input
    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in); // Create scanner
        System.out.println("Enter a string:");    // Prompt for user input
        String input = scanner.nextLine();

        // Process each character in the string
        for (char ch : input.toUpperCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (map.containsKey(ch)) {
                    int count = map.get(ch); // Get current count
                    map.put(ch, count + 1);  // Increment count
                } else {
                    map.put(ch, 1); // Add new letter with count 1
                }
            }
        }
    }

    // Display map content
    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet(); // Get keys
        TreeSet<Character> sortedKeys = new TreeSet<>(keys); // Sort keys

        System.out.printf("%nMap contains:%nKey\t\t\t\tValue%n");

        // Generate output for each key in map
        for (Character key : sortedKeys)
            System.out.printf("%-10s%10d%n", key, map.get(key));

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
