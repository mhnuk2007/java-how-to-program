package chapter17.exercises;
/*
17.9 (Summarizing the Characters in a File) Modify the program of Fig. 17.17 to
summarize the number of occurrences of every character in the file.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamOfCharacters {
    public static void main(String[] args) throws IOException {
        // Read file and count each character's frequency
        Map<Character, Long> charCounts = Files.lines(Paths.get("Chapter2Paragraph.txt"))
                .flatMapToInt(String::chars) // stream of int (char codes)
                .mapToObj(c -> (char) c) // convert int to Character
                .filter(c -> !Character.isWhitespace(c)) // ignore whitespace (optional)
                .collect(Collectors.groupingBy(
                        Character::toLowerCase, // group by lowercase char
                        TreeMap::new,           // sorted map
                        Collectors.counting())); // count occurrences

        // Display character counts
        System.out.println("Character frequencies:\n");
        charCounts.forEach((character, count) ->
                System.out.printf("'%c' : %d%n", character, count));
    }
}
