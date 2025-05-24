package chapter14.exercises;
/*
Exercise: 14.6 (Project: Limericks) A limerick is a humorous five-line verse in which the first and second lines
rhyme with the fifth, and the third line rhymes with the fourth. Using techniques similar to those developed
in Exercise 14.5, write a Java application that produces random limericks. Polishing
this application to produce good limericks is a challenging problem, but the result will
be worth the effort!
 */

import java.util.Random;

public class RandomLimerick {
    public static void main(String[] args) {
        Random rand = new Random();

        // Lines that rhyme with each other (A rhyme)
        String[] aLines = {
            "There once was a cat from Peru",
            "A lady who wore a bright shoe",
            "A man with a curious view",
            "The frog sang a song in the zoo",
            "A bird flew across skies so blue"
        };

        // Lines that rhyme with each other (B rhyme)
        String[] bLines = {
            "Who dreamed he was eating a shoe",
            "He danced on the roof in the dew",
            "And hopped in the morning anew",
            "While sipping some warm chamomile brew",
            "He laughed as the night softly grew"
        };

        // Randomly pick lines for the limerick (1,2,5 from aLines and 3,4 from bLines)
        String line1 = aLines[rand.nextInt(aLines.length)];
        String line2 = aLines[rand.nextInt(aLines.length)];
        String line3 = bLines[rand.nextInt(bLines.length)];
        String line4 = bLines[rand.nextInt(bLines.length)];
        String line5 = aLines[rand.nextInt(aLines.length)];

        // Print the limerick
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
