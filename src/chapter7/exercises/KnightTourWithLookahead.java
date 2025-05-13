package chapter7.exercises;
/*
Exercise: 7.22 (Knight’s Tour) An interesting puzzler for chess buffs is the Knight’s Tour problem, originally proposed by the mathematician Euler. Can the knight piece move around an empty chessboard and touch each of the 64 squares once and only once? We study this intriguing problem in
depth here.
The knight makes only L-shaped moves (two spaces in one direction and one space in a perpendicular direction). Thus, as shown in Fig. 7.30, from a square near the middle of an empty
chessboard, the knight (labeled K) can make eight different moves (numbered 0 through 7).
Fig. 7.30 | The eight possible moves of the knight
a) Draw an eight-by-eight chessboard on a sheet of paper, and attempt a Knight’s Tour by
hand. Put a 1 in the starting square, a 2 in the second square, a 3 in the third, and so on.
Before starting the tour, estimate how far you think you’ll get, remembering that a full
tour consists of 64 moves. How far did you get? Was this close to your estimate?
b) Now let’s develop an application that will move the knight around a chessboard. The
board is represented by an eight-by-eight two-dimensional array board. Each square is
initialized to zero. We describe each of the eight possible moves in terms of its horizontal and vertical components. For example, a move of type 0, as shown in Fig. 7.30, consists of moving two squares horizontally to the right and one square vertically upward.
A move of type 2 consists of moving one square horizontally to the left and two squares
vertically upward. Horizontal moves to the left and vertical moves upward are indicated
with negative numbers. The eight moves may be described by two one-dimensional arrays, horizontal and vertical, as follows:
horizontal\[0] = 2 vertical\[0] = -1
horizontal\[1] = 1 vertical\[1] = -2
horizontal\[2] = -1 vertical\[2] = -2
horizontal\[3] = -2 vertical\[3] = -1
horizontal\[4] = -2 vertical\[4] = 1
horizontal\[5] = -1 vertical\[5] = 2
horizontal\[6] = 1 vertical\[6] = 2
horizontal\[7] = 2 vertical\[7] = 1
Let the variables currentRow and currentColumn indicate the row and column,
respectively, of the knight’s current position. To make a move of type moveNumber,
where moveNumber is between 0 and 7, your application should use the statements
currentRow += vertical\[moveNumber];
currentColumn += horizontal\[moveNumber];
Write an application to move the knight around the chessboard. Keep a counter
that varies from 1 to 64. Record the latest count in each square the knight moves to.
Test each potential move to see if the knight has already visited that square. Test every
potential move to ensure that the knight does not land off the chessboard. Run the
application. How many moves did the knight make?
c) After attempting to write and run a Knight’s Tour application, you’ve probably developed some valuable insights. We’ll use these insights to develop a heuristic (i.e., a common-sense rule) for moving the knight. Heuristics do not guarantee success, but a
carefully developed heuristic greatly improves the chance of success. You may have observed that the outer squares are more troublesome than the squares nearer the center
of the board. In fact, the most troublesome or inaccessible squares are the four corners.
Intuition may suggest that you should attempt to move the knight to the most
troublesome squares first and leave open those that are easiest to get to, so that when
the board gets congested near the end of the tour, there will be a greater chance of success.
We could develop an “accessibility heuristic” by classifying each of the squares
according to how accessible it is and always moving the knight (using the knight’s Lshaped moves) to the most inaccessible square. We label a two-dimensional array
accessibility with numbers indicating from how many squares each particular
square is accessible. On a blank chessboard, each of the 16 squares nearest the center is
rated as 8, each corner square is rated as 2, and the other squares have accessibility
numbers of 3, 4 or 6 as follows:
2 3 4 4 4 4 3 2
3 4 6 6 6 6 4 3
4 6 8 8 8 8 6 4
4 6 8 8 8 8 6 4
4 6 8 8 8 8 6 4
4 6 8 8 8 8 6 4
3 4 6 6 6 6 4 3
2 3 4 4 4 4 3 2
Write a new version of the Knight’s Tour, using the accessibility heuristic. The
knight should always move to the square with the lowest accessibility number. In case
of a tie, the knight may move to any of the tied squares. Therefore, the tour may begin
in any of the four corners. \[Note: As the knight moves around the chessboard, your
application should reduce the accessibility numbers as more squares become occupied.
In this way, at any given time during the tour, each available square’s accessibility number will remain equal to precisely the number of squares from which that square may
be reached.] Run this version of your application. Did you get a full tour? Modify the
application to run 64 tours, one starting from each square of the chessboard. How
many full tours did you get?
d) Write a version of the Knight’s Tour application that, when encountering a tie between
two or more squares, decides what square to choose by looking ahead to those squares
reachable from the “tied” squares. Your application should move to the tied square for
which the next move would arrive at a square with the lowest accessibility number.
 */

public class KnightTourWithLookahead {
    private static final int BOARD_SIZE = 8;
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical   = {-1, -2, -2, -1, 1, 2, 2, 1};

    private static final int[][] accessibility = {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}
    };

    public static void main(String[] args) {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        int[][] localAccess = new int[BOARD_SIZE][BOARD_SIZE];

        // Copy accessibility map
        for (int i = 0; i < BOARD_SIZE; i++)
            for (int j = 0; j < BOARD_SIZE; j++)
                localAccess[i][j] = accessibility[i][j];

        int currentRow = 0;  // Starting position
        int currentCol = 0;
        int moveCount = 1;
        board[currentRow][currentCol] = moveCount;

        while (moveCount < BOARD_SIZE * BOARD_SIZE) {
            int minAccess = Integer.MAX_VALUE;
            int bestMoveIndex = -1;
            int bestLookahead = Integer.MAX_VALUE;

            // First, collect all valid moves with min accessibility (tied)
            for (int move = 0; move < 8; move++) {
                int newRow = currentRow + vertical[move];
                int newCol = currentCol + horizontal[move];

                if (isValid(newRow, newCol, board)) {
                    int access = localAccess[newRow][newCol];

                    if (access < minAccess) {
                        minAccess = access;
                        bestMoveIndex = move;
                        bestLookahead = getLookaheadMin(board, newRow, newCol, localAccess);
                    } else if (access == minAccess) {
                        // Tie: do lookahead
                        int lookahead = getLookaheadMin(board, newRow, newCol, localAccess);
                        if (lookahead < bestLookahead) {
                            bestMoveIndex = move;
                            bestLookahead = lookahead;
                        }
                    }
                }
            }

            // If no move is possible
            if (bestMoveIndex == -1) break;

            // Make the move
            currentRow += vertical[bestMoveIndex];
            currentCol += horizontal[bestMoveIndex];
            moveCount++;
            board[currentRow][currentCol] = moveCount;

            // Update accessibility values for surrounding cells
            for (int move = 0; move < 8; move++) {
                int r = currentRow + vertical[move];
                int c = currentCol + horizontal[move];
                if (isValid(r, c, board)) {
                    localAccess[r][c]--;
                }
            }
        }

        // Output result
        printBoard(board);
        System.out.println("Total Moves: " + moveCount + (moveCount == 64 ? " ✅ Full tour!" : " ❌ Incomplete tour."));
    }

    // Check if a square is valid and unvisited
    private static boolean isValid(int row, int col, int[][] board) {
        return row >= 0 && row < BOARD_SIZE &&
                col >= 0 && col < BOARD_SIZE &&
                board[row][col] == 0;
    }

    // Look ahead to find the minimum accessibility from a potential move
    private static int getLookaheadMin(int[][] board, int row, int col, int[][] access) {
        int min = Integer.MAX_VALUE;

        for (int move = 0; move < 8; move++) {
            int r = row + vertical[move];
            int c = col + horizontal[move];
            if (isValid(r, c, board)) {
                min = Math.min(min, access[r][c]);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    // Print the board
    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }
}
