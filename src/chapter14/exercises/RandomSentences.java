package chapter14.exercises;
/*
Exercise: 14.5 (Random Sentences) Write an application that uses random-number generation to create
sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
by selecting a word at random from each array in the following order: article, noun, verb, preposition, article and noun. As each word is picked, concatenate it to the previous words in the sentence.
The words should be separated by spaces. When the final sentence is output, it should start with a
capital letter and end with a period. The application should generate and display 20 sentences.
The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should contain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
contain the prepositions "to", "from", "over", "under" and "on".
 */

import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            // Build a sentence by selecting random words
            StringBuilder sentence = new StringBuilder();

            sentence.append(article[random.nextInt(article.length)]).append(" ");
            sentence.append(noun[random.nextInt(noun.length)]).append(" ");
            sentence.append(verb[random.nextInt(verb.length)]).append(" ");
            sentence.append(preposition[random.nextInt(preposition.length)]).append(" ");
            sentence.append(article[random.nextInt(article.length)]).append(" ");
            sentence.append(noun[random.nextInt(noun.length)]);

            // Capitalize first letter
            sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));

            // Add period at the end
            sentence.append(".");

            System.out.println(sentence.toString());
        }
    }
}
