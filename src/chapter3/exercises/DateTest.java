package chapter3.exercises;

// Test application for Date class
public class DateTest {
    public static void main(String[] args) {

        // Create Date object
        Date date = new Date(4, 23, 2025);

        // Display the initial date
        System.out.print("Initial date: ");
        date.displayDate();

        // Update the date values
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2025);

        // Display the updated date
        System.out.print("Updated date: ");
        date.displayDate();
    }
}
