package chapter8.exercises;
/*
Exercise: 8.12 (Date and Time Class) Create class DateAndTime that combines the modified Time2 class of
Exercise 8.7 and the modified Date class of Exercise 8.8. Modify method incrementHour to call
method nextDay if the time is incremented into the next day. Modify methods toString and toUniversalString
to output the date in addition to the time. Write a program to test the new class DateAndTime. Specifically,
test incrementing the time to the next day.
 */

class DateAndTime {
    private EnhancedTime2 time;
    private EnhancedDate date;

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        date = new EnhancedDate(month, day, year);
        time = new EnhancedTime2(hour, minute, second);
    }

    // Tick (increment second)
    public void tick() {
        time.tick();
        // If time rolled over to midnight, increment date
        if (time.getHour() == 0 && time.getMinute() == 0 && time.getSecond() == 0) {
            date.nextDay();
        }
    }

    // Increment minute by one
    public void incrementMinute() {
        time.incrementMinute();
        // If time rolled over to midnight, increment date
        if (time.getHour() == 0 && time.getMinute() == 0) {
            date.nextDay();
        }
    }

    // Increment hour by one
    public void incrementHour() {
        int prevHour = time.getHour();
        time.incrementHour();
        // If hour rolls from 23 to 0, increment date
        if (prevHour == 23 && time.getHour() == 0) {
            date.nextDay();
        }
    }

    // Return date and time in universal format (24-hour)
    public String toUniversalString() {
        return String.format("%s %s", date.toString(), time.toUniversalString());
    }

    // Return date and time in standard format (12-hour)
    public String toString() {
        return String.format("%s %s", date.toString(), time.toString());
    }
}

// Test class with cases
public class DateAndTimeTest {
    public static void main(String[] args) {
        System.out.println("=== Testing DateAndTime incrementHour to next day ===");
        DateAndTime dt1 = new DateAndTime(12, 31, 2025, 23, 30, 0);
        System.out.println("Before: " + dt1.toUniversalString());
        dt1.incrementHour(); // expect 01/01/2026 00:30:00
        System.out.println("After:  " + dt1.toUniversalString());

        System.out.println("\n=== Testing DateAndTime tick to next day ===");
        DateAndTime dt2 = new DateAndTime(2, 28, 2024, 23, 59, 59); // leap year
        System.out.println("Before: " + dt2.toUniversalString());
        dt2.tick(); // expect 02/29/2024 00:00:00
        System.out.println("After:  " + dt2.toUniversalString());

        System.out.println("\n=== Testing DateAndTime incrementMinute to next day ===");
        DateAndTime dt3 = new DateAndTime(1, 31, 2025, 23, 59, 0);
        System.out.println("Before: " + dt3.toUniversalString());
        dt3.incrementMinute(); // expect 02/01/2025 00:00:00
        System.out.println("After:  " + dt3.toUniversalString());
    }
}
