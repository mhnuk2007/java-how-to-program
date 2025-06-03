package chapter16.examples;
// Fig. 16.16: SetTest.java
// HashSet used to remove duplicate values from array of strings.

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // create and display a List<String>
        String[] colors = {
                "red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"
        };

        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        // eliminate duplicates then print the unique values
        printNonDuplicates(list);
    }

    // create a Set from a Collection to eliminate duplicates
    private static void printNonDuplicates(List<String> list) {
        Set<String> set = new HashSet<>(list);

        System.out.printf("%nNonduplicates are: ");
        for (String value : set) {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }

}
