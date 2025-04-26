package Chapter6.exercises;

/*
    6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18
    to receive a second parameter of type char called fillCharacter. Form the square using
    the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method
    should display:
        #####
        #####
        #####
        #####
        #####
*/

import java.util.Scanner;

public class SquareOfAnyChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        int side = input.nextInt();

        System.out.print("Enter the character to fill the square: ");
        char fillCharacter = input.next().charAt(0);

        squareOfAsterisks(side, fillCharacter);

        input.close();
    }

    public static void squareOfAsterisks(int side, char fillCharacter) {
        int rows = side;
        while (rows > 0) {
            int columns = side;
            while (columns > 0) {
                System.out.print(fillCharacter);
                columns--;
            }
            System.out.println();
            rows--;
        }
    }
}
