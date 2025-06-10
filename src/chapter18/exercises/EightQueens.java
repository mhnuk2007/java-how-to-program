package chapter18.exercises;
/*
Exercise 18.15: 18.15 (Eight Queens) A puzzler for chess buffs is the Eight Queens problem, which asks:
Is it possible to place eight queens on an empty chessboard so that no queen is “attacking” any other (i.e.,
no two queens are in the same row, in the same column or along the same diagonal)? For instance,
if a queen is placed in the upper-left corner of the board, no other queens could be placed in any of
the marked squares shown in Fig. 18.20. Solve the problem recursively. [Hint: Your solution should
begin with the first column and look for a location in that column where a queen can be placed—
initially, place the queen in the first row. The solution should then recursively search the remaining
columns. In the first few columns, there will be several locations where a queen may be placed. Take
the first available location. If a column is reached with no possible location for a queen, the program
should return to the previous column, and move the queen in that column to a new row. This continuous
backing up and trying new alternatives is an example of recursive backtracking.]
 */

public class EightQueens {

    private static final int SIZE = 8; // Chessboard size (8x8)
    private int[] board = new int[SIZE]; // board[col] = row where queen is placed in column col

    public boolean solve() {
        return placeQueen(0);
    }

    // Recursive method to place queen in a given column
    private boolean placeQueen(int col) {
        if (col == SIZE) { // All queens placed
            return true;
        }

        for (int row = 0; row < SIZE; row++) {
            if (canPlace(col, row)) {
                board[col] = row; // Place queen
                if (placeQueen(col + 1)) { // Recur to place next queen
                    return true;
                }
                // Backtrack: no need to explicitly remove queen because board[col] will be overwritten
            }
        }
        return false; // No valid row found for this column, backtrack
    }

    // Check if queen can be placed at (col, row)
    private boolean canPlace(int col, int row) {
        for (int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = board[prevCol];
            if (prevRow == row) return false; // Same row
            if (Math.abs(prevRow - row) == Math.abs(prevCol - col)) return false; // Same diagonal
        }
        return true;
    }

    // Print the chessboard with queens
    public void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[col] == row) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EightQueens eq = new EightQueens();

        if (eq.solve()) {
            System.out.println("Solution to Eight Queens:");
            eq.printBoard();
        } else {
            System.out.println("No solution found.");
        }
    }
}
