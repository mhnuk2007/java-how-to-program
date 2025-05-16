package chapter8.exercises;
/*
Exercise: 8.14 (Date Class) Create class Date with the following capabilities:
a) Output the date in multiple formats, such as
MM/DD/YYYY
June 14, 1992
DDD YYYY
b) Use overloaded constructors to create Date objects initialized with dates of the formats
in part (a). In the first case the constructor should receive three integer values. In the
second case it should receive a String and two integer values. In the third case it should
receive two integer values, the first of which represents the day number in the year.
[Hint: To convert the String representation of the month to a numeric value, compare
Strings using the equals method. For example, if s1 and s2 are Strings, the method
call s1.equals(s2) returns true if the Strings are identical and otherwise returns
false.]
 */
class Date {
    private int month;
    private int day;
    private int year;

    // Month names
    private static final String[] monthNames = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Days in month (non-leap year)
    private static final int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Constructor 1: MM/DD/YYYY
    public Date(int month, int day, int year) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor 2: "MonthName", DD, YYYY
    public Date(String monthName, int day, int year) {
        int m = getMonthNumberFromName(monthName);
        if (m == -1 || !isValidDate(m, day, year)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.month = m;
        this.day = day;
        this.year = year;
    }

    // Constructor 3: DDD YYYY
    public Date(int dayOfYear, int year) {
        if (dayOfYear < 1 || dayOfYear > (isLeapYear(year) ? 366 : 365)) {
            throw new IllegalArgumentException("Invalid day of year");
        }
        this.year = year;

        int m = 1;
        int remainingDays = dayOfYear;

        while (m <= 12) {
            int dim = daysInMonth[m];
            if (m == 2 && isLeapYear(year)) dim++; // adjust for leap year

            if (remainingDays <= dim) {
                this.month = m;
                this.day = remainingDays;
                break;
            }
            remainingDays -= dim;
            m++;
        }
    }

    // Method to get month number from month name
    private int getMonthNumberFromName(String name) {
        for (int i = 1; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1; // invalid
    }

    // Helper: Check if date is valid
    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12 || day < 1 || year < 1) return false;
        int dim = daysInMonth[month];
        if (month == 2 && isLeapYear(year)) dim++;
        return day <= dim;
    }

    // Helper: Check leap year
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Format 1: MM/DD/YYYY
    public String format1() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    // Format 2: MonthName DD, YYYY
    public String format2() {
        return String.format("%s %d, %d", monthNames[month], day, year);
    }

    // Format 3: DDD YYYY (day of year)
    public String format3() {
        return String.format("%03d %d", getDayOfYear(), year);
    }

    // Get the day number in the year
    private int getDayOfYear() {
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
            if (i == 2 && isLeapYear(year)) dayOfYear++; // Feb leap adjustment
        }
        return dayOfYear;
    }

    // Default toString returns format1
    @Override
    public String toString() {
        return format1();
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(6, 14, 1992);
        System.out.println("Format 1: " + d1.format1());
        System.out.println("Format 2: " + d1.format2());
        System.out.println("Format 3: " + d1.format3());

        Date d2 = new Date("June", 14, 1992);
        System.out.println("\nFormat 1: " + d2.format1());
        System.out.println("Format 2: " + d2.format2());
        System.out.println("Format 3: " + d2.format3());

        Date d3 = new Date(166, 1992);
        System.out.println("\nFormat 1: " + d3.format1());
        System.out.println("Format 2: " + d3.format2());
        System.out.println("Format 3: " + d3.format3());

        Date d4 = new Date(60, 2024); // leap year Feb 29
        System.out.println("\nFormat 1: " + d4.format1());
        System.out.println("Format 2: " + d4.format2());
        System.out.println("Format 3: " + d4.format3());
    }
}
