package Chapter7.exercises;
/*
7.26 (Knight’s Tour: Closed-Tour Test) In the Knight’s Tour (Exercise 7.22), a full tour occurs
when the knight makes 64 moves, touching each square of the chessboard once and only once. A
closed tour occurs when the 64th move is one move away from the square in which the knight started the tour. Modify the application you wrote in Exercise 7.22 to test for a closed tour if a full tour
has occurred.
*/

public class KnightsTourClosedTest {
    static final int SIZE = 8;
    static int[][] board = new int[SIZE][SIZE];
    static int[][] accessibility = {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}
    };
    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        // Try tours starting from each position on the board
        int fullTours = 0;
        int closedTours = 0;

        System.out.println("Testing Knight's Tour from all 64 starting positions...");

        for (int startRow = 0; startRow < SIZE; startRow++) {
            for (int startCol = 0; startCol < SIZE; startCol++) {
                resetBoard();
                int moveCount = tryTour(startRow, startCol);

                if (moveCount == SIZE * SIZE) {
                    fullTours++;
                    // Find the last position (where the 64th move was made)
                    int lastRow = -1, lastCol = -1;
                    for (int r = 0; r < SIZE; r++) {
                        for (int c = 0; c < SIZE; c++) {
                            if (board[r][c] == SIZE * SIZE) {
                                lastRow = r;
                                lastCol = c;
                            }
                        }
                    }

                    // Check if it's a closed tour
                    if (isClosedTour(startRow, startCol, lastRow, lastCol)) {
                        closedTours++;
                        System.out.printf("Closed tour found starting at position (%d,%d)%n", startRow, startCol);
                    }
                }

                // Progress indicator
                System.out.printf("Tested starting position (%d,%d): %s tour (moves: %d)%n",
                        startRow, startCol,
                        (moveCount == SIZE * SIZE ? "Full" : "Partial"),
                        moveCount);
            }
        }

        System.out.println("\nSummary:");
        System.out.println("Total full tours found: " + fullTours);
        System.out.println("Total closed tours found: " + closedTours);

        // If any closed tours were found, print one example
        if (closedTours > 0) {
            System.out.println("\nPrinting an example of a closed tour:");
            // Find and print a closed tour
            printClosedTourExample();
        }
    }

    static int tryTour(int startRow, int startCol) {
        int currentRow = startRow;
        int currentCol = startCol;
        int moveCount = 1;

        // Create a copy of the original accessibility matrix
        int[][] accessCopy = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            System.arraycopy(accessibility[i], 0, accessCopy[i], 0, SIZE);
        }

        // Mark the starting position
        board[currentRow][currentCol] = moveCount;

        // Update accessibility for affected squares
        updateAccessibility(currentRow, currentCol, accessCopy);

        boolean movePossible;

        do {
            movePossible = false;
            int minAccess = Integer.MAX_VALUE;
            int bestMove = -1;
            int nextRow = -1, nextCol = -1;

            // Find square with minimum accessibility
            for (int move = 0; move < 8; move++) {
                int r = currentRow + vertical[move];
                int c = currentCol + horizontal[move];

                if (isValidMove(r, c) && accessCopy[r][c] < minAccess) {
                    minAccess = accessCopy[r][c];
                    bestMove = move;
                    nextRow = r;
                    nextCol = c;
                    movePossible = true;
                }
            }

            // If we found a valid move, make it
            if (movePossible) {
                currentRow = nextRow;
                currentCol = nextCol;
                board[currentRow][currentCol] = ++moveCount;

                // Update accessibility for affected squares
                updateAccessibility(currentRow, currentCol, accessCopy);
            }
        } while (movePossible);

        return moveCount;
    }

    // Helper method to update accessibility
    static void updateAccessibility(int row, int col, int[][] accessMatrix) {
        for (int move = 0; move < 8; move++) {
            int r = row + vertical[move];
            int c = col + horizontal[move];
            if (r >= 0 && r < SIZE && c >= 0 && c < SIZE && accessMatrix[r][c] > 0) {
                accessMatrix[r][c]--;
            }
        }
    }

    // Improved method to check for a closed tour
    static boolean isClosedTour(int startRow, int startCol, int lastRow, int lastCol) {
        // Check if the last position is one knight's move away from the starting position
        for (int move = 0; move < 8; move++) {
            int r = lastRow + vertical[move];
            int c = lastCol + horizontal[move];
            if (r == startRow && c == startCol) {
                return true;
            }
        }
        return false;
    }

    static void printClosedTourExample() {
        // Reset and find a closed tour
        for (int startRow = 0; startRow < SIZE; startRow++) {
            for (int startCol = 0; startCol < SIZE; startCol++) {
                resetBoard();
                int moveCount = tryTour(startRow, startCol);

                // Find the last position
                int lastRow = -1, lastCol = -1;
                if (moveCount == SIZE * SIZE) {
                    for (int r = 0; r < SIZE; r++) {
                        for (int c = 0; c < SIZE; c++) {
                            if (board[r][c] == SIZE * SIZE) {
                                lastRow = r;
                                lastCol = c;
                            }
                        }
                    }
                }

                if (moveCount == SIZE * SIZE && isClosedTour(startRow, startCol, lastRow, lastCol)) {
                    System.out.printf("Printing closed tour starting at position (%d,%d):%n",
                            startRow, startCol);
                    printBoard();

                    // Also visualize the closed tour path
                    printClosedTourPath(startRow, startCol, lastRow, lastCol);
                    return;
                }
            }
        }
    }

    static void printClosedTourPath(int startRow, int startCol, int lastRow, int lastCol) {
        System.out.println("\nPath of the closed tour:");
        System.out.printf("Start: (%d,%d)%n", startRow, startCol);
        System.out.printf("End: (%d,%d)%n", lastRow, lastCol);

        // Show the "closing move" back to the start
        System.out.println("The closing move that would complete the cycle:");
        System.out.printf("From (%d,%d) back to (%d,%d)%n",
                lastRow, lastCol, startRow, startCol);

        // Visualize the path
        char[][] pathBoard = new char[SIZE][SIZE];
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                pathBoard[r][c] = '.';
            }
        }

        // Mark each position with its move number
        for (int move = 1; move <= SIZE * SIZE; move++) {
            for (int r = 0; r < SIZE; r++) {
                for (int c = 0; c < SIZE; c++) {
                    if (board[r][c] == move) {
                        // First move
                        if (move == 1) {
                            pathBoard[r][c] = 'S'; // Start
                        }
                        // Last move
                        else if (move == SIZE * SIZE) {
                            pathBoard[r][c] = 'E'; // End
                        }
                        // Other moves
                        else {
                            pathBoard[r][c] = '*'; // Path
                        }
                    }
                }
            }
        }

        // Print the path visualization
        System.out.println("\nPath visualization (S=Start, E=End, *=Path):");
        System.out.println("   0 1 2 3 4 5 6 7");
        for (int r = 0; r < SIZE; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < SIZE; c++) {
                System.out.print(" " + pathBoard[r][c]);
            }
            System.out.println();
        }
    }

    static boolean isValidMove(int r, int c) {
        return r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c] == 0;
    }

    static void resetBoard() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                board[r][c] = 0;
            }
        }
    }

    static void printBoard() {
        System.out.println("   0  1  2  3  4  5  6  7");
        for (int r = 0; r < SIZE; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < SIZE; c++) {
                System.out.printf("%2d ", board[r][c]);
            }
            System.out.println();
        }
    }
}