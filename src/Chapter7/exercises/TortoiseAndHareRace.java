package Chapter7.exercises;

import java.util.Random;

/**
 * 7.28 (Simulation: The Tortoise and the Hare) 
 * This program simulates the classic race between the tortoise and the hare.
 * The race takes place on a course of 70 squares, with both animals starting at position 1.
 * With each tick of the clock (1 second), both animals move according to specific rules.
 * The first to reach or pass square 70 wins the race.
 */
import java.util.Random;

public class TortoiseAndHareRace {
    // Constants for the race
    private static final int RACE_LENGTH = 70;
    private static final int START_POSITION = 1;
    private static final int FINISH_LINE = 70;

    // Tortoise movements
    private static final int TORTOISE_FAST_PLOD = 3;   // move forward 3
    private static final int TORTOISE_SLIP = -6;       // move back 6
    private static final int TORTOISE_SLOW_PLOD = 1;   // move forward 1

    // Hare movements
    private static final int HARE_SLEEP = 0;           // no move
    private static final int HARE_BIG_HOP = 9;         // move forward 9
    private static final int HARE_BIG_SLIP = -12;      // move back 12
    private static final int HARE_SMALL_HOP = 1;       // move forward 1
    private static final int HARE_SMALL_SLIP = -2;     // move back 2

    private static final Random random = new Random();

    public static void main(String[] args) {
        int tortoisePosition = START_POSITION;
        int harePosition = START_POSITION;
        int clockTick = 0;

        System.out.println("BANG !!!!! AND THEY'RE OFF !!!!!");

        boolean raceOver = false;

        while (!raceOver) {
            clockTick++;

            // Move the tortoise and hare
            tortoisePosition = moveTortoise(tortoisePosition);
            harePosition = moveHare(harePosition);

            // Don't allow positions less than 1
            tortoisePosition = Math.max(START_POSITION, tortoisePosition);
            harePosition = Math.max(START_POSITION, harePosition);

            // Show the race track
            displayRaceStatus(tortoisePosition, harePosition);

            // Check if someone has reached or passed the finish line
            if (tortoisePosition >= FINISH_LINE || harePosition >= FINISH_LINE) {
                raceOver = true;

                // Decide the winner
                if (tortoisePosition >= FINISH_LINE && harePosition >= FINISH_LINE) {
                    System.out.println("IT'S A TIE!");
                } else if (tortoisePosition >= FINISH_LINE) {
                    System.out.println("TORTOISE WINS!!! YAY!!!");
                } else {
                    System.out.println("Hare wins. Yuch.");
                }
            }

            // Pause for a short moment to see the race steps
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Final race summary
        System.out.printf("%nRace finished after %d clock ticks.%n", clockTick);
        System.out.printf("Final positions: Tortoise: %d, Hare: %d%n", tortoisePosition, harePosition);
    }

    // Move the tortoise based on random chance
    private static int moveTortoise(int currentPosition) {
        int move = random.nextInt(10) + 1;

        if (move <= 5) {             // 50% chance
            return currentPosition + TORTOISE_FAST_PLOD;
        } else if (move <= 7) {      // 20% chance
            return currentPosition + TORTOISE_SLIP;
        } else {                     // 30% chance
            return currentPosition + TORTOISE_SLOW_PLOD;
        }
    }

    // Move the hare based on random chance
    private static int moveHare(int currentPosition) {
        int move = random.nextInt(10) + 1;

        if (move <= 2) {             // 20% chance
            return currentPosition + HARE_SLEEP;
        } else if (move <= 4) {      // 20% chance
            return currentPosition + HARE_BIG_HOP;
        } else if (move == 5) {      // 10% chance
            return currentPosition + HARE_BIG_SLIP;
        } else if (move <= 8) {      // 30% chance
            return currentPosition + HARE_SMALL_HOP;
        } else {                     // 20% chance
            return currentPosition + HARE_SMALL_SLIP;
        }
    }

    // Display the current race track with T, H, or OUCH!!!
    private static void displayRaceStatus(int tortoisePosition, int harePosition) {
        StringBuilder track = new StringBuilder();

        // Create a track of 70 spaces
        for (int i = 1; i <= RACE_LENGTH; i++) {
            track.append(" ");
        }

        // If both animals are at the same spot
        if (tortoisePosition == harePosition) {
            placeStringAt(track, "OUCH!!!", tortoisePosition - 1);
        } else {
            if (tortoisePosition <= RACE_LENGTH) {
                track.setCharAt(tortoisePosition - 1, 'T');
            }
            if (harePosition <= RACE_LENGTH) {
                track.setCharAt(harePosition - 1, 'H');
            }
        }

        // Print the track
        System.out.println(track.toString());
    }

    // Place a word like "OUCH!!!" on the track
    private static void placeStringAt(StringBuilder track, String text, int position) {
        int end = Math.min(position + text.length(), RACE_LENGTH);
        for (int i = position, j = 0; i < end; i++, j++) {
            track.setCharAt(i, text.charAt(j));
        }
    }
}
