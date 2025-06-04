package chapter16.exercises;
/*
16.13 (Duplicate Elimination) Write a program that reads in a series of first names
and eliminates duplicates by storing them in a Set. Allow the user to search for a first name.
 */

import java.util.*;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nameSet = new HashSet<>();

        System.out.println("Enter first names (type 'done' to finish):");
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("done"))
                break;

            if (nameSet.add(name)) {
                System.out.println("Added.");
            } else {
                System.out.println("Duplicate - not added.");
            }
        }

        // Show unique names
        System.out.println("\nUnique names:");
        for (String name : nameSet) {
            System.out.println(name);
        }

        // Search functionality
        System.out.print("\nEnter a name to search: ");
        String searchName = scanner.nextLine().trim();

        if (nameSet.contains(searchName)) {
            System.out.println(searchName + " was found in the set.");
        } else {
            System.out.println(searchName + " was NOT found in the set.");
        }

        scanner.close();
    }
}
