package Chapter7.exercises;
/*
Exercise: 7.15 (Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is
specified by the first command-line argument. If no command-line argument is supplied,
use 10 as the default size of the array.
 */

public class CommandLineArraySize {
    public static void main(String[] args) {
        //Default size of the array
        int size = 10;

        // Check if a command-line argument is provided
        if (args.length > 0) {
            // Parse the command-line argument as an integer
            size = Integer.parseInt(args[0]);
        }

        int[] array = new int[size];




    }
}
