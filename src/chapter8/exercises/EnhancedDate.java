package chapter8.exercises;
/*
Exercise: 8.8 (Enhancing Class Date) Modify class Date of Fig. 8.7 to perform error checking on the initializer values for instance variables month, day and year (currently it validates only the month and
day). Provide a method nextDay to increment the day by one. Write a program that tests method
nextDay in a loop that prints the date during each iteration to illustrate that the method works correctly. Test the following cases:
a) incrementing into the next month and
b) incrementing into the next year.
 */

public class EnhancedDate {
    private int month; // 1-12
    private int day;   // 1-31 based on month
    private int year;  // any year >= 1

    private static final int[] daysPerMonth = 
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor with validation
    public EnhancedDate(int month, int day, int year) {
        if (year < 1)
            throw new IllegalArgumentException("year (" + year + ") must be >= 1");

        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        if (day <= 0 || (day > daysInMonth(month, year))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    // Helper method to get days in a month for given year
    private int daysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysPerMonth[month];
    }

    // Check if year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    // Increment day by 1
    public void nextDay() {
        day++;
        if (day > daysInMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    // Return date in string format: mm/dd/yyyy
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
} // end class EnhancedDate

class EnhancedDateTest {
    public static void main(String[] args) {
        // Case a) Increment into next month
        System.out.println("Case a) Incrementing into next month:");
        EnhancedDate date1 = new EnhancedDate(1, 30, 2025); // Jan 30, 2025
        for (int i = 0; i < 3; i++) {
            System.out.println(date1);
            date1.nextDay();
        }

        // Case b) Increment into next year
        System.out.println("\nCase b) Incrementing into next year:");
        EnhancedDate date2 = new EnhancedDate(12, 30, 2025); // Dec 30, 2025
        for (int i = 0; i < 3; i++) {
            System.out.println(date2);
            date2.nextDay();
        }
    }
} // end class EnhancedDateTest
