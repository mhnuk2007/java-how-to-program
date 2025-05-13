package chapter7.exercises;
/*
Exercise: 7.21 (Turtle Graphics) The Logo language made the concept of turtle graphics famous. Imagine
a mechanical turtle that walks around the room under the control of a Java application. The turtle
holds a pen in one of two positions, up or down. While the pen is down, the turtle traces out shapes
as it moves, and while the pen is up, the turtle moves about freely without writing anything. In this
problem, you’ll simulate the operation of the turtle and create a computerized sketchpad.
Use a 20-by-20 array floor that’s initialized to zeros. Read commands from an array that contains them. Keep track of the current position of the turtle at all times and whether the pen is currently up or down. Assume that the turtle always starts at position (0, 0) of the floor with its pen
up. The set of turtle commands your application must process are shown in Fig. 7.29.
Command Meaning
1 Pen up
2 Pen down
3 Turn right
4 Turn left
5,10 Move forward 10 spaces (replace 10 for a different number of spaces)
6 Display the 20-by-20 array
9 End of data (sentinel)
Fig. 7.29 | Turtle graphics commands.
Suppose that the turtle is somewhere near the center of the floor. The following “program”
would draw and display a 12-by-12 square, leaving the pen in the up position:
2
5,12
3
5,12
3
5,12
3
5,12
1
6
9
As the turtle moves with the pen down, set the appropriate elements of array floor to 1s. When the
6 command (display the array) is given, wherever there’s a 1 in the array, display an asterisk or any
character you choose. Wherever there’s a 0, display a blank.
Write an application to implement the turtle graphics capabilities discussed here. Write several
turtle graphics programs to draw interesting shapes. Add other commands to increase the power of
your turtle graphics language.
 */

public class TurtleGraphics {
    // Constants
    public static final int SIZE = 20;

    // Directions
    public static final int RIGHT = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int UP = 3;

    public static void main(String[] args) {
        int[][] floor = new int[SIZE][SIZE];  // 20x20 floor initialized to 0

        int x = 0;           // turtle's current row
        int y = 0;           // turtle's current column
        int direction = RIGHT; // starting direction
        boolean penDown = false;

        // Sample commands to draw a 12x12 square
        int[][] commands = {
                {2},        // Pen down
                {5, 12},    // Move forward 12
                {3},        // Turn right
                {5, 12},
                {3},
                {5, 12},
                {3},
                {5, 12},
                {1},        // Pen up
                {6},        // Display
                {9}         // End
        };

        for (int[] command : commands) {
            int cmd = command[0];

            switch (cmd) {
                case 1:
                    penDown = false;
                    break;
                case 2:
                    penDown = true;
                    break;
                case 3:
                    direction = (direction + 1) % 4; // turn right
                    break;
                case 4:
                    direction = (direction + 3) % 4; // turn left
                    break;
                case 5:
                    int steps = command[1];
                    for (int i = 0; i < steps; i++) {
                        // Update position with bounds check
                        switch (direction) {
                            case RIGHT:
                                if (y + 1 < SIZE) y++;
                                break;
                            case LEFT:
                                if (y - 1 >= 0) y--;
                                break;
                            case UP:
                                if (x - 1 >= 0) x--;
                                break;
                            case DOWN:
                                if (x + 1 < SIZE) x++;
                                break;
                        }
                        if (penDown) {
                            floor[x][y] = 1;
                        }
                    }
                    break;
                case 6:
                    displayFloor(floor);
                    break;
                case 9:
                    System.out.println("End of program.");
                    return;
                default:
                    System.out.println("Invalid command: " + cmd);
            }
        }
    }

    // Function to display the floor array
    public static void displayFloor(int[][] floor) {
        System.out.println("\nTurtle Drawing:");
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "* " : "  ");
            }
            System.out.println();
        }
    }
}
