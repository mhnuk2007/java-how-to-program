package chapter18.exercises;
/*
Exercise 18.22: (Mazes of Any Size) Generalize methods mazeTraversal and mazeGenerator of
Exercise 18.20 and Exercise 18.21 to process mazes of any width and height.
 */

import java.util.Random;

public class MazeGeneralized {

    private static final char WALL = '#';
    private static final char PATH = '.';
    private static final char VISITED = 'x';
    private static final char DEAD_END = '0';

    private static Random random = new Random();

    // Maze generator for any size maze
    public static void mazeGenerator(char[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;

        // Fill maze with walls
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                maze[r][c] = WALL;

        // Select random start and end on edges (avoid corners)
        int startRow, startCol, endRow, endCol;

        // Choose start on top or left edge randomly
        if (random.nextBoolean()) {
            // Top edge start
            startRow = 0;
            startCol = random.nextInt(cols - 2) + 1;
        } else {
            // Left edge start
            startRow = random.nextInt(rows - 2) + 1;
            startCol = 0;
        }

        // Choose end on bottom or right edge randomly
        if (random.nextBoolean()) {
            // Bottom edge end
            endRow = rows - 1;
            endCol = random.nextInt(cols - 2) + 1;
        } else {
            // Right edge end
            endRow = random.nextInt(rows - 2) + 1;
            endCol = cols - 1;
        }

        maze[startRow][startCol] = PATH;
        maze[endRow][endCol] = PATH;

        // Carve a simple path from start to end (vertical then horizontal or vice versa)
        int currentRow = startRow;
        int currentCol = startCol;

        // Move vertically to endRow
        while (currentRow != endRow) {
            if (currentRow < endRow)
                currentRow++;
            else
                currentRow--;
            maze[currentRow][currentCol] = PATH;
        }

        // Move horizontally to endCol
        while (currentCol != endCol) {
            if (currentCol < endCol)
                currentCol++;
            else
                currentCol--;
            maze[currentRow][currentCol] = PATH;
        }

        // Randomly carve some extra paths
        int carveAttempts = (rows * cols) / 5; // arbitrary number of extra paths
        for (int i = 0; i < carveAttempts; i++) {
            int r = random.nextInt(rows - 2) + 1;
            int c = random.nextInt(cols - 2) + 1;
            maze[r][c] = PATH;
        }
    }

    // Recursive maze traversal that works for any maze size
    public static boolean mazeTraversal(char[][] maze, int row, int col) throws InterruptedException {
        int rows = maze.length;
        int cols = maze[0].length;

        // Delay for visualization (optional)
        Thread.sleep(50);
        printMaze(maze);

        // Check boundaries
        if (row < 0 || row >= rows || col < 0 || col >= cols)
            return false;

        // Only traverse paths
        if (maze[row][col] != PATH)
            return false;

        // Mark current position as visited
        maze[row][col] = VISITED;

        // Check if on an exit edge (but not starting position)
        boolean onEdge = (row == 0 || row == rows - 1 || col == 0 || col == cols - 1);
        if (onEdge && maze[row][col] == VISITED) {
            // Since this is the first time visiting, we accept it as exit
            return true;
        }

        // Recursive search in four directions
        if (mazeTraversal(maze, row + 1, col) ||
            mazeTraversal(maze, row, col + 1) ||
            mazeTraversal(maze, row - 1, col) ||
            mazeTraversal(maze, row, col - 1)) {
            return true;
        }

        // Dead end - mark as such and backtrack
        maze[row][col] = DEAD_END;
        printMaze(maze);
        return false;
    }

    // Print maze utility for any size
    public static void printMaze(char[][] maze) {
        for (char[] row : maze) {
            for (char ch : row)
                System.out.print(ch + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        int rows = 15; // try any size
        int cols = 20;

        char[][] maze = new char[rows][cols];

        mazeGenerator(maze);

        System.out.println("Generated Maze:");
        printMaze(maze);

        // Find start position (first path on edges)
        int startRow = -1, startCol = -1;
        outer:
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if ((r == 0 || r == rows - 1 || c == 0 || c == cols - 1) && maze[r][c] == PATH) {
                    startRow = r;
                    startCol = c;
                    break outer;
                }
            }
        }

        System.out.printf("Start Position: (%d, %d)%n", startRow, startCol);

        if (startRow != -1 && mazeTraversal(maze, startRow, startCol)) {
            System.out.println("Maze solved!");
        } else {
            System.out.println("No path found.");
        }

        printMaze(maze);
    }
}
