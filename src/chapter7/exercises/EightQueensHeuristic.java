package chapter7.exercises;
/*
Exercise: 7.24 (Eight Queens) Another puzzler for chess buffs is the Eight Queens problem, which asks the
following: Is it possible to place eight queens on an empty chessboard so that no queen is “attacking”
any other (i.e., no two queens are in the same row, in the same column or along the same diagonal)?
Use the thinking developed in Exercise 7.22 to formulate a heuristic for solving the Eight Queens
problem. Run your application. \[Hint: It’s possible to assign a value to each square of the chessboard
to indicate how many squares of an empty chessboard are “eliminated” if a queen is placed in that
square. Each of the corners would be assigned the value 22, as demonstrated by Fig. 7.31. Once
these “elimination numbers” are placed in all 64 squares, an appropriate heuristic might be as follows: Place the next queen in the square with the smallest elimination number. Why is this strategy
intuitively appealing?]
 */

public class EightQueensHeuristic {

    private static final int SIZE = 8;
    private static final int[][] eliminationBoard = new int[SIZE][SIZE];
    private static final boolean[][] board = new boolean[SIZE][SIZE];

    private static final boolean[] rowsAttacked = new boolean[SIZE];
    private static final boolean[] columnsAttacked = new boolean[SIZE];
    private static final boolean[] mainDiagonalsAttacked = new boolean[2 * SIZE - 1];
    private static final boolean[] antiDiagonalsAttacked = new boolean[2 * SIZE - 1];

    // Store queen positions for backtracking
    private static final int[] queensPositions = new int[SIZE]; // Store column for each row

    public static void main(String[] args) {
        solveQueens();
    }

    private static void solveQueens() {
        // Initialize the board and tracking arrays
        for (int i = 0; i < SIZE; i++) {
            queensPositions[i] = -1; // No queens placed initially
        }

        calculateInitialEliminationBoard();

        if (placeQueensWithBacktracking(0)) {
            System.out.println("Eight Queens Solution:");
            printBoard();
        } else {
            System.out.println("No solution found for the Eight Queens problem.");
        }
    }

    // Backtracking algorithm with heuristic guidance
    private static boolean placeQueensWithBacktracking(int row) {
        if (row == SIZE) {
            return true; // All queens have been placed successfully
        }

        // Find the column with the minimum elimination value in the current row
        int[] columnOrder = getColumnsOrderedByElimination(row);

        for (int colIndex = 0; colIndex < SIZE; colIndex++) {
            int col = columnOrder[colIndex];

            if (isSafe(row, col)) {
                // Place queen and update tracking arrays
                placeQueen(row, col);
                queensPositions[row] = col;

                // Recalculate elimination values
                recalculateEliminationBoard();

                // Try to place the next queen
                if (placeQueensWithBacktracking(row + 1)) {
                    return true;
                }

                // If placing the next queen fails, backtrack
                removeQueen(row, col);
                queensPositions[row] = -1;
                recalculateEliminationBoard();
            }
        }

        return false; // No valid position found for this row
    }

    // Get columns ordered by their elimination values (ascending)
    private static int[] getColumnsOrderedByElimination(int row) {
        int[] columns = new int[SIZE];
        int[] values = new int[SIZE];

        // Initialize columns
        for (int i = 0; i < SIZE; i++) {
            columns[i] = i;
            values[i] = isSafe(row, i) ? eliminationBoard[row][i] : Integer.MAX_VALUE;
        }

        // Simple bubble sort by elimination values
        for (int i = 0; i < SIZE - 1; i++) {
            for (int j = 0; j < SIZE - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    // Swap values
                    int tempValue = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tempValue;

                    // Swap columns
                    int tempCol = columns[j];
                    columns[j] = columns[j + 1];
                    columns[j + 1] = tempCol;
                }
            }
        }

        return columns;
    }

    // Calculates elimination numbers for the board
    private static void calculateInitialEliminationBoard() {
        for (int qr = 0; qr < SIZE; qr++) {
            for (int qc = 0; qc < SIZE; qc++) {
                // Count all eliminated squares by placing a queen at (qr, qc)
                int count = 0;
                for (int r = 0; r < SIZE; r++) {
                    for (int c = 0; c < SIZE; c++) {
                        if (r == qr || c == qc || Math.abs(r - qr) == Math.abs(c - qc)) {
                            count++;
                        }
                    }
                }
                eliminationBoard[qr][qc] = count - 1; // Subtract 1 to not count the square itself twice
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

    // Recalculates the elimination board
    private static void recalculateEliminationBoard() {
        // First reset the elimination board
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                eliminationBoard[r][c] = 0;
            }
        }

        // Calculate how many squares each position would attack
        for (int qr = 0; qr < SIZE; qr++) {
            for (int qc = 0; qc < SIZE; qc++) {
                if (board[qr][qc]) {
                    eliminationBoard[qr][qc] = Integer.MAX_VALUE; // Already has a queen
                    continue;
                }

                if (!isSafe(qr, qc)) {
                    eliminationBoard[qr][qc] = Integer.MAX_VALUE; // Not safe
                    continue;
                }

                // Count how many safe squares this would eliminate
                int count = 0;
                for (int r = 0; r < SIZE; r++) {
                    for (int c = 0; c < SIZE; c++) {
                        if (!board[r][c] && isSafe(r, c) &&
                                (r == qr || c == qc || Math.abs(r - qr) == Math.abs(c - qc))) {
                            count++;
                        }
                    }
                }
                eliminationBoard[qr][qc] = count;
            }
        }
    }

    // Prints the current board with queens placed
    private static void printBoard() {
        System.out.println("  0 1 2 3 4 5 6 7"); // Column numbers
        for (int row = 0; row < SIZE; row++) {
            System.out.print(row + " "); // Row number
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }
}