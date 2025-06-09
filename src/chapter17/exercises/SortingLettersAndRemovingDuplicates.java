package chapter17.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class SortingLettersAndRemovingDuplicates {
    public static void main(String[] args) {
        // Create a list to hold 30 random letters
        List<Character> letters = new ArrayList<>();
        Random random = new Random();

        // Generate 30 random lowercase letters (a-z)
        for (int i = 0; i < 30; i++) {
            char letter = (char) ('a' + random.nextInt(26));
            letters.add(letter);
        }

        // Display original list
        System.out.println("Original list:");
        letters.forEach(c -> System.out.print(c + " "));
        System.out.println();

        // a) Sort in ascending order
        List<Character> ascending = new ArrayList<>(letters);
        ascending.sort(Comparator.naturalOrder());
        System.out.println("\nSorted in ascending order:");
        ascending.forEach(c -> System.out.print(c + " "));
        System.out.println();

        // b) Sort in descending order
        List<Character> descending = new ArrayList<>(letters);
        descending.sort(Comparator.reverseOrder());
        System.out.println("\nSorted in descending order:");
        descending.forEach(c -> System.out.print(c + " "));
        System.out.println();

        // c) Ascending order with duplicates removed
        List<Character> ascendingUnique = letters.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nAscending order with duplicates removed:");
        ascendingUnique.forEach(c -> System.out.print(c + " "));
    }
}
