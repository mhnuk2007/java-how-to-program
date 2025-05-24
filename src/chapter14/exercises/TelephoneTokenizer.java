package chapter14.exercises;
/*
14.8 (Tokenizing Telephone Numbers) Write an application that inputs a telephone number as a
string in the form (555) 555-5555. The application should use String method split to extract the
area code as a token, the first three digits of the phone number as a token and the last four digits of
the phone number as a token. The seven digits of the phone number should be concatenated into
one string. Both the area code and the phone number should be printed. Remember that you’ll have
to change delimiter characters during the tokenization process.
 */

import java.util.Scanner;

public class TelephoneTokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number in the format (555) 555-5555: ");
        String input = scanner.nextLine();

        // Step 1: Remove unwanted characters: '(', ')' and space
        String cleanedInput = input.replace("(", "").replace(")", "").replace(" ", "");

        // Step 2: Split using '-' as delimiter
        String[] tokens = cleanedInput.split("-");

        if (tokens.length == 2 && tokens[0].length() == 3 && tokens[1].length() == 4) {
            String areaCode = tokens[0].substring(0, 3); // First 3 digits are area code
            String firstThree = tokens[0].substring(3);  // Remaining if any (in case input is invalid)
            String lastFour = tokens[1];                 // Last 4 digits

            // Final 7-digit phone number
            String phoneNumber = tokens[0] + tokens[1];

            System.out.println("Area Code: " + areaCode);
            System.out.println("Phone Number: " + phoneNumber);
        } else {
            System.out.println("Invalid phone number format.");
        }

        scanner.close();
    }
}
