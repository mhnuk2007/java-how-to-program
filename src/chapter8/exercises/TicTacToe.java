package chapter8.exercises;
/*
Exercise: 8.17 (Tic-Tac-Toe) Create a class TicTacToe that will enable you to write a program to play TicTac-Toe. The class contains a private 3-by-3 two-dimensional array. Use an enum type to represent
the value in each cell of the array. The enum’s constants should be named X, O and EMPTY (for a position that does not contain an X or an O). The constructor should initialize the board elements to
EMPTY. Allow two human players. Wherever the first player moves, place an X in the specified square,
and place an O wherever the second player moves. Each move must be to an empty square. After
each move, determine whether the game has been won and whether it’s a draw. If you feel ambitious, modify your program so that the computer makes the moves for one of the players. Also, allow
the player to specify whether he or she wants to go first or second. If you feel exceptionally ambitious, develop a program that will play three-dimensional Tic-Tac-Toe on a 4-by-4-by-4 board
[Note: This is an extremely challenging project!].
 */

import java.util.Scanner;

public class TicTacToe {
    private enum Cell { EMPTY, X, O }

    private final Cell[][] board;
    private boolean xTurn;

    // Constructor: Initializes the board
    public TicTacToe() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = Cell.EMPTY;
        xTurn = true; // X always starts
    }

    // Display the board
    public void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X -> System.out.print(" X ");
                    case O -> System.out.print(" O ");
                    case EMPTY -> System.out.print("   ");
                }
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    // Make a move at (row, col)
    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3)
            return false;
        if (board[row][col] != Cell.EMPTY)
            return false;

        board[row][col] = xTurn ? Cell.X : Cell.O;
        xTurn = !xTurn;
        return true;
    }

    // Check for winner
    public Cell checkWinner() {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != Cell.EMPTY &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2])
                return board[i][0];

            if (board[0][i] != Cell.EMPTY &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i])
                return board[0][i];
        }

        // Diagonals
        if (board[0][0] != Cell.EMPTY &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2])
            return board[0][0];

        if (board[0][2] != Cell.EMPTY &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0])
            return board[0][2];

        return Cell.EMPTY;
    }

    // Check if the board is full
    public boolean isDraw() {
        for (Cell[] row : board)
            for (Cell cell : row)
                if (cell == Cell.EMPTY)
                    return false;
        return checkWinner() == Cell.EMPTY;
    }

    // Entry point to play
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        System.out.println("Welcome to Tic-Tac-Toe!");
        game.printBoard();

        while (true) {
            System.out.printf("Player %s, enter your move (row[0-2] and column[0-2]): ",
                              game.xTurn ? "X" : "O");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!game.makeMove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            game.printBoard();

            Cell winner = game.checkWinner();
            if (winner != Cell.EMPTY) {
                System.out.printf("Player %s wins!\n", winner);
                break;
            }

            if (game.isDraw()) {
                System.out.println("The game is a draw.");
                break;
            }
        }

        scanner.close();
    }
}
