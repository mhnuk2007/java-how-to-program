package chapter18.examples;
/*
  This program solves a maze using recursive backtracking.
  It starts at a given point and tries to find a path to the exit,
  moving up, down, left, or right while avoiding walls.
  The program marks the path taken and backtracks if it hits a dead end,
  ultimately printing the solved maze or reporting no solution.
 */


public class MazeSolver {
    private static final int PATH = 0;    // open path
    private static final int WALL = 1;    // wall
    private static final int VISITED = 2; // visited path

    private int[][] maze;  // maze grid
    private int rows, cols;
    private int startRow, startCol;
    private int endRow, endCol;

    public MazeSolver(int[][] maze, int startRow, int startCol, int endRow, int endCol) {
        this.maze = maze;
        this.rows = maze.length;
        this.cols = maze[0].length;
        this.startRow = startRow;
        this.startCol = startCol;
        this.endRow = endRow;
        this.endCol = endCol;
    }

    // Try to find a path from (row, col) to the end
    public boolean solveMaze(int row, int col) {
        // Check if current position is outside maze or not a path
        if (row < 0 || row >= rows || col < 0 || col >= cols) return false;
        if (maze[row][col] != PATH) return false;

        // Mark this cell as visited
        maze[row][col] = VISITED;

        // Check if we reached the end
        if (row == endRow && col == endCol) return true;

        // Try moving down
        if (solveMaze(row + 1, col)) return true;
        // Try moving right
        if (solveMaze(row, col + 1)) return true;
        // Try moving up
        if (solveMaze(row - 1, col)) return true;
        // Try moving left
        if (solveMaze(row, col - 1)) return true;

        // No way forward, backtrack by unmarking this cell
        maze[row][col] = PATH;
        return false;
    }

    // Print the maze to the console
    public void printMaze() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == startRow && c == startCol) {
                    System.out.print("S "); // Start position
                } else if (r == endRow && c == endCol) {
                    System.out.print("E "); // End position
                } else if (maze[r][c] == WALL) {
                    System.out.print("# "); // Wall
                } else if (maze[r][c] == VISITED) {
                    System.out.print(". "); // Path taken
                } else {
                    System.out.print("  "); // Empty space
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 0 = open path, 1 = wall
        int[][] maze = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0}
        };

        MazeSolver solver = new MazeSolver(maze, 0, 0, 4, 4);

        if (solver.solveMaze(solver.startRow, solver.startCol)) {
            System.out.println("Maze solved! Path marked with '.'");
        } else {
            System.out.println("No path found.");
        }

        solver.printMaze();
    }
}
