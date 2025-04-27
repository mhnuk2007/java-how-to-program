package Chapter6.exercises;
/*
    6.33 (Craps Game Modification) Modify the craps program of Fig. 6.8 to allow wagering.
    Initialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager.
    Check that wager is less than or equal to bankBalance, and if it’s not, have the user
    reenter wager until a valid wager is entered. Then, run one game of craps. If the player
    wins, increase bankBalance by wager and display the new bankBalance. If the player loses,
    decrease bankBalance by wager, display the new bankBalance, check whether bankBalance
    has become zero and, if so, display the message "Sorry. You busted!" As the game progresses,
    display various messages to create some “chatter,” such as "Oh, you're going for broke,
    huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time to cash in your
    chips!". Implement the “chatter” as a separate method that randomly chooses the string
    to display.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsWithWagering {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bankBalance = 1000; // Start with $1000

        while (bankBalance > 0) {
            System.out.printf("Your current bank balance is: $%d%n", bankBalance);
            System.out.print("Enter your wager: ");
            int wager = input.nextInt();

            // Check for valid wager
            while (wager > bankBalance || wager <= 0) {
                System.out.print("Invalid wager. Please enter a wager less than or equal to your bank balance: ");
                wager = input.nextInt();
            }

            Status gameStatus;
            int myPoint = 0;

            int sumOfDice = rollDice(); // first roll

            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }

            // Update bank balance
            if (gameStatus == Status.WON) {
                bankBalance += wager;
                System.out.println("Player wins!");
            } else {
                bankBalance -= wager;
                System.out.println("Player loses.");
            }

            System.out.printf("New bank balance: $%d%n", bankBalance);

            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
                break;
            }

            // Display random chatter
            if (bankBalance != 0) {
                chatter();
                System.out.println();
            }

        }

        input.close();
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }

    // Display random chatter without using array
    public static void chatter() {
        int chatterPick = 1 + randomNumbers.nextInt(3); // Random number between 1 and 3

        if (chatterPick == 1) {
            System.out.println("Oh, you're going for broke, huh?");
        } else if (chatterPick == 2) {
            System.out.println("Aw c'mon, take a chance!");
        } else {
            System.out.println("You're up big. Now's the time to cash in your chips!");
        }
    }
}
