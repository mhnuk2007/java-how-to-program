package chapter7.exercises;
/*
Exercise: 7.18 (Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
answers the following questions:
a) How many games are won on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
c) What are the chances of winning at craps? [Note: You should discover that craps is one
of the fairest casino games. What do you suppose this means?]
d) What is the average length of a game of craps?
e) Do the chances of winning improve with the length of the game?
 */

import java.security.SecureRandom;

public class CrapsSimulation {
    private static final SecureRandom random = new SecureRandom();

    private enum Status { CONTINUE, WON, LOST }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        final int SIMULATIONS = 1_000_000;
        final int MAX_ROLL_TRACK = 21; // Roll 1 to 20 and 21+ (index 21)

        int[] winsPerRoll = new int[MAX_ROLL_TRACK];
        int[] lossesPerRoll = new int[MAX_ROLL_TRACK];
        int totalWins = 0;
        int totalLosses = 0;
        long totalRolls = 0;

        for (int i = 0; i < SIMULATIONS; i++) {
            int rollCount = 1;
            int sumOfDice = rollDice();
            int point = 0;
            Status gameStatus;

            // First roll outcome
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
                    point = sumOfDice;
            }

            // Continue rolling until game is WON or LOST
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                rollCount++;

                if (sumOfDice == point) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }

            // Record results
            if (rollCount >= MAX_ROLL_TRACK) rollCount = MAX_ROLL_TRACK-1; // Group 21 and above

            if (gameStatus == Status.WON) {
                winsPerRoll[rollCount]++;
                totalWins++;
            } else {
                lossesPerRoll[rollCount]++;
                totalLosses++;
            }

            totalRolls += rollCount;
        }

        // Display results
        System.out.printf("%-10s%-10s%-10s%n", "Roll#", "Wins", "Losses");
        for (int i = 1; i < MAX_ROLL_TRACK; i++) {
            String label = (i == 21) ? "21+" : String.valueOf(i);
            System.out.printf("%-10s%-10d%-10d%n", label, winsPerRoll[i], lossesPerRoll[i]);
        }

        // c) Winning percentage
        double winPercentage = 100.0 * totalWins / SIMULATIONS;
        System.out.printf("%nTotal games: %d%n", SIMULATIONS);
        System.out.printf("Wins: %d, Losses: %d%n", totalWins, totalLosses);
        System.out.printf("Winning percentage: %.2f%%%n", winPercentage);

        // d) Average game length
        double avgGameLength = (double) totalRolls / SIMULATIONS;
        System.out.printf("Average game length: %.2f rolls%n", avgGameLength);

        // e) Observational note
        System.out.println("Note: The longer the game goes, the less frequent it is.");
    }

    // Method to simulate rolling two dice
    private static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        return die1 + die2;
    }
}
