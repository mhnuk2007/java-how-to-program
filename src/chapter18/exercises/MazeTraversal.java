package chapter18.exercises;
/*
Exercise 18.20: (Maze Traversal Using Recursive Backtracking) The grid of #s and dots (.)
in Fig. 18.22 is a two-dimensional array representation of a maze. The #s represent the
walls of the maze, and the dots represent locations in the possible paths through the
maze. A move can be made only to a location in the array that contains a dot.
Write a recursive method mazeTraversal that:
Receives the maze array and current position as arguments
Moves down, right, up, or left recursively
Marks path with 'x' and backtracks on dead ends using '0'
Displays the maze at each step
Outputs only the correct solution path after traversal
 */

public class MazeTraversal {

    private static final int SIZE = 12;
    private static final char WALL = '#';
    private static final char PATH = '.';
    private static final char VISITED = 'x';
    private static final char DEAD_END = '0';

    private static char[][] maze = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#'},
            {'.', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#'},
            {'#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#'},
            {'#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '.'},
            {'#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
            {'#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
            {'#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#'},
            {'#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#'},
            {'#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    public static void printMaze() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(maze[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean mazeTraversal(int row, int col) {
        printMaze();

        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            return false;
        }
        if (maze[row][col] != PATH) {
            return false;
        }

        maze[row][col] = VISITED;

        // Check for exit (border but not starting point)
        if ((row == 0 || row == SIZE - 1 || col == 0 || col == SIZE - 1)
                && !(row == 1 && col == 1)) {
            return true;
        }

        if (mazeTraversal(row + 1, col) || // down
                mazeTraversal(row, col + 1) || // right
                mazeTraversal(row - 1, col) || // up
                mazeTraversal(row, col - 1)) { // left
            return true;
        }

        maze[row][col] = DEAD_END;
        printMaze();
        return false;
    }

    public static void cleanDeadEnds() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (maze[r][c] == DEAD_END) {
                    maze[r][c] = PATH;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial Maze:");
        printMaze();

        if (mazeTraversal(1, 1)) {
            System.out.println("Maze solved! Path marked by 'x':");
        } else {
            System.out.println("No path found.");
        }

        cleanDeadEnds();  // Optional: Remove 0's for cleaner final maze
        printMaze();
    }
}
