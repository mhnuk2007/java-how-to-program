package chapter18.exercises;
/*
Exercise 18.21 (Generating Mazes Randomly) Write a method mazeGenerator that takes as an
argument a two-dimensional 12-by-12 character array and randomly produces a maze.
The method should also provide the starting and ending locations of the maze.
Test your method mazeTraversal from Exercise 18.20, using several randomly generated
mazes.
 */

import java.util.Random;

public class MazeGenerator {

    private static final int SIZE = 12;
    private static final char WALL = '#';
    private static final char PATH = '.';

    private static char[][] maze = new char[SIZE][SIZE];
    private static int startRow, startCol, endRow, endCol;
    private static Random random = new Random();

    // Generate maze with a guaranteed path from start to end
    public static void mazeGenerator(char[][] maze) {
        // Fill maze with walls
        for (int r = 0; r < SIZE; r++)
            for (int c = 0; c < SIZE; c++)
                maze[r][c] = WALL;

        // Randomly select start and end points on edges (but not corners)
        startRow = 0;
        startCol = random.nextInt(SIZE - 2) + 1; // Top row, col in [1..SIZE-2]
        endRow = SIZE - 1;
        endCol = random.nextInt(SIZE - 2) + 1;   // Bottom row, col in [1..SIZE-2]

        maze[startRow][startCol] = PATH;
        maze[endRow][endCol] = PATH;

        // Carve a path from start to end (simple vertical + horizontal path)
        int currentRow = startRow;
        int currentCol = startCol;

        // Move downwards until near the bottom row
        while (currentRow < endRow) {
            currentRow++;
            maze[currentRow][currentCol] = PATH;
        }

        // Move horizontally until reach endCol
        while (currentCol != endCol) {
            if (currentCol < endCol) currentCol++;
            else currentCol--;
            maze[currentRow][currentCol] = PATH;
        }

        // Randomly carve some extra paths branching from main path
        for (int i = 0; i < 30; i++) {
            int r = random.nextInt(SIZE - 2) + 1;
            int c = random.nextInt(SIZE - 2) + 1;
            maze[r][c] = PATH;
        }
    }

    // Utility to print the maze
    public static void printMaze(char[][] maze) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(maze[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Maze traversal solver from Exercise 18.20
    public static boolean mazeTraversal(char[][] maze, int row, int col) throws InterruptedException {
        final char VISITED = 'x';
        final char DEAD_END = '0';

        // Delay for visualization (can remove or set to 0 if not desired)
        Thread.sleep(50);
        printMaze(maze);

        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE)
            return false;
        if (maze[row][col] != PATH)
            return false;

        maze[row][col] = VISITED;

        // Exit condition: at the edge but not start
        if ((row == 0 || row == SIZE - 1 || col == 0 || col == SIZE - 1)
                && !(row == startRow && col == startCol)) {
            return true;
        }

        if (mazeTraversal(maze, row + 1, col) ||
            mazeTraversal(maze, row, col + 1) ||
            mazeTraversal(maze, row - 1, col) ||
            mazeTraversal(maze, row, col - 1)) {
            return true;
        }

        maze[row][col] = DEAD_END;
        printMaze(maze);
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        mazeGenerator(maze);

        System.out.println("Generated Maze:");
        printMaze(maze);

        System.out.printf("Start: (%d, %d), End: (%d, %d)%n", startRow, startCol, endRow, endCol);

        if (mazeTraversal(maze, startRow, startCol)) {
            System.out.println("Maze solved!");
        } else {
            System.out.println("No path found.");
        }
        printMaze(maze);
    }
}
