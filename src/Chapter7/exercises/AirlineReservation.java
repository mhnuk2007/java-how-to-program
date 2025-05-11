package Chapter7.exercises;
/*
Exercise: 7.19 (Airline Reservations System) A small airline has just purchased a computer for its new automated reservations system. You’ve been asked to develop the new system. You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives: Please type 1 for First Class and
Please type 2 for Economy. If the user types 1, your application should assign a seat in the firstclass section (seats 1–5). If the user types 2, your application should assign a seat in the economy
section (seats 6–10). Your application should then display a boarding pass indicating the person’s
seat number and whether it’s in the first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to represent the seating chart of the
plane. Initialize all the elements of the array to false to indicate that all the seats are empty. As
each seat is assigned, set the corresponding element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already been assigned. When the economy
section is full, your application should ask the person if it’s acceptable to be placed in the first-class
section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
 */

import java.util.Scanner;

public class AirlineReservation {
    // Array to track seat reservations (false = available, true = reserved)
    private static final boolean[] seats = new boolean[10];

    // Scanner for user input
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Keep running until the plane is full
        while (true) {
            // If all seats are taken, stop the program
            if (isPlaneFull()) {
                System.out.println("Next flight leaves in 3 hours.");
                break;
            }

            // Ask user to choose class
            System.out.println("Please type 1 for First Class and Please type 2 for Economy.");
            int choice = input.nextInt();

            if (choice == 1) {
                // Try to assign a First Class seat (seats 1–5)
                if (!reserveSeat(0, 4, "First Class")) {
                    // If full, ask if they want Economy
                    System.out.println("First Class is full. Would you like Economy? (yes/no)");
                    if (input.next().equalsIgnoreCase("yes")) {
                        reserveSeat(5, 9, "Economy");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else if (choice == 2) {
                // Try to assign an Economy seat (seats 6–10)
                if (!reserveSeat(5, 9, "Economy")) {
                    // If full, ask if they want First Class
                    System.out.println("Economy is full. Would you like First Class? (yes/no)");
                    if (input.next().equalsIgnoreCase("yes")) {
                        reserveSeat(0, 4, "First Class");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                }
            } else {
                // If input is not 1 or 2
                System.out.println("Invalid choice.");
            }
        }
    }

    // Tries to reserve a seat in a given section
    private static boolean reserveSeat(int start, int end, String sectionName) {
        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true; // Mark seat as taken
                System.out.printf("Boarding pass: Seat #%d - %s%n", i + 1, sectionName);
                return true;
            }
        }
        return false; // No seats available in this section
    }

    // Checks if all seats are taken
    private static boolean isPlaneFull() {
        for (boolean seat : seats) {
            if (!seat) return false; // Found an available seat
        }
        return true; // All seats are full
    }
}