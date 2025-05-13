package chapter7.exercises;
/*
Exercise 7.25 (Eight Queens: Brute-Force Approaches)
a) Random brute-force technique to solve the Eight Queens problem
*/

import java.util.Random;

public class EightQueensRandomBruteForce {
    private static final int SIZE = 8;
    private static final boolean[][] board = new boolean[SIZE][SIZE];
    private static final Random random = new Random();

    // Keep track of positions under attack
    private static final boolean[] rowsAttacked = new boolean[SIZE];
    private static final boolean[] columnsAttacked = new boolean[SIZE];
    private static final boolean[] mainDiagonalsAttacked = new boolean[2 * SIZE - 1]; // diagonals: r-c+SIZE-1
    private static final boolean[] antiDiagonalsAttacked = new boolean[2 * SIZE - 1]; // anti-diagonals: r+c

    // Store queen positions
    private static final int[] queensPositions = new int[SIZE]; // column position for each row

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int attempts = randomBruteForce();
        long endTime = System.currentTimeMillis();

        System.out.println("Solution found after " + attempts + " attempts.");
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds.");
        printBoard();
    }

    private static int randomBruteForce() {
        int attempts = 0;
        boolean solutionFound = false;

        while (!solutionFound) {
            attempts++;
            resetBoard();

            // Try to place 8 queens randomly
            int queensPlaced = 0;

            // For random brute force, we'll try to place queens one by one
            for (int queen = 0; queen < SIZE; queen++) {
                // Find all safe squares
                int safeSquaresCount = 0;
                int[][] safeSquares = new int[SIZE * SIZE][2]; // Store [row, col] of safe squares

                for (int row = 0; row < SIZE; row++) {
                    for (int col = 0; col < SIZE; col++) {
                        if (isSafe(row, col)) {
                            safeSquares[safeSquaresCount][0] = row;
                            safeSquares[safeSquaresCount][1] = col;
                            safeSquaresCount++;
                        }
                    }
                }

                // If no safe squares, break and try again
                if (safeSquaresCount == 0) {
                    break;
                }

                // Select a random safe square
                int randomIndex = random.nextInt(safeSquaresCount);
                int selectedRow = safeSquares[randomIndex][0];
                int selectedCol = safeSquares[randomIndex][1];

                // Place queen
                placeQueen(selectedRow, selectedCol);
                queensPositions[queensPlaced] = selectedCol;
                queensPlaced++;
            }

            // Check if all 8 queens were placed
            if (queensPlaced == SIZE) {
                solutionFound = true;
            }

            // Status update every million attempts
            if (attempts % 1000000 == 0) {
                System.out.println("Attempted " + attempts + " configurations...");
            }
        }

        return attempts;
    }

    private static boolean isSafe(int row, int col) {
        return !board[row][col] &&
                !rowsAttacked[row] &&
                !columnsAttacked[col] &&
                !mainDiagonalsAttacked[row - col + SIZE - 1] &&
                !antiDiagonalsAttacked[row + col];
    }

    private static void placeQueen(int row, int col) {
        board[row][col] = true;
        rowsAttacked[row] = true;
        columnsAttacked[col] = true;
        mainDiagonalsAttacked[row - col + SIZE - 1] = true;
        antiDiagonalsAttacked[row + col] = true;
    }

    private static void resetBoard() {
        // Reset the board
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = false;
            }
            rowsAttacked[i] = false;
            columnsAttacked[i] = false;
            queensPositions[i] = -1;
        }

        // Reset diagonals
        for (int i = 0; i < 2 * SIZE - 1; i++) {
            mainDiagonalsAttacked[i] = false;
            antiDiagonalsAttacked[i] = false;
        }
    }

    private static void printBoard() {
        System.out.println("  0 1 2 3 4 5 6 7"); // Column numbers
        for (int row = 0; row < SIZE; row++) {
            System.out.print(row + " "); // Row number
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}