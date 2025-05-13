package Chapter7.exercises;
/*
Exercise 7.25 (Eight Queens: Brute-Force Approaches)
b) Exhaustive brute-force technique to solve the Eight Queens problem
*/

public class EightQueensExhaustiveBruteForce {
    private static final int SIZE = 8;
    private static final boolean[][] board = new boolean[SIZE][SIZE];

    // Keep track of positions under attack
    private static final boolean[] rowsAttacked = new boolean[SIZE];
    private static final boolean[] columnsAttacked = new boolean[SIZE];
    private static final boolean[] mainDiagonalsAttacked = new boolean[2 * SIZE - 1]; // diagonals: r-c+SIZE-1
    private static final boolean[] antiDiagonalsAttacked = new boolean[2 * SIZE - 1]; // anti-diagonals: r+c

    // Store queen positions (column for each row)
    private static final int[] queensPositions = new int[SIZE];

    // Track statistics
    private static long configurationsChecked = 0;
    private static int solutionsFound = 0;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Initialize queen positions to -1 (no queens placed)
        for (int i = 0; i < SIZE; i++) {
            queensPositions[i] = -1;
        }

        // Start exhaustive search (row by row approach)
        System.out.println("Finding all solutions for the Eight Queens problem...");
        findAllSolutions(0);

        long endTime = System.currentTimeMillis();

        System.out.println("Total configurations checked: " + configurationsChecked);
        System.out.println("Total solutions found: " + solutionsFound);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    // Row-by-row exhaustive approach (more efficient than trying all 64C8 combinations)
    private static void findAllSolutions(int row) {
        if (row == SIZE) {
            // All rows have a queen - we found a solution
            solutionsFound++;
            System.out.println("\nSolution #" + solutionsFound + ":");
            printBoard();
            return;
        }

        // Try each column in the current row
        for (int col = 0; col < SIZE; col++) {
            configurationsChecked++;

            if (isSafe(row, col)) {
                // Place queen
                placeQueen(row, col);
                queensPositions[row] = col;

                // Move to next row
                findAllSolutions(row + 1);

                // Backtrack
                removeQueen(row, col);
                queensPositions[row] = -1;
            }

            // Status update for large computations
            if (row == 0 && configurationsChecked % 1000000 == 0) {
                System.out.println("Checked " + configurationsChecked + " configurations...");
            }
        }
    }

    private static boolean isSafe(int row, int col) {
        return !rowsAttacked[row] &&
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

    private static void removeQueen(int row, int col) {
        board[row][col] = false;
        rowsAttacked[row] = false;
        columnsAttacked[col] = false;
        mainDiagonalsAttacked[row - col + SIZE - 1] = false;
        antiDiagonalsAttacked[row + col] = false;
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