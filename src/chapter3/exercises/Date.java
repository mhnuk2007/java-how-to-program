package chapter3.exercises;
/*
    3.14 (Date Class) Create a class called Date that includes three instance variables—
    a month (type int), a day (type int) and a year (type int). Provide a constructor that
    initializes the three instance variables and assumes that the values provided are
    correct. Provide a set and a get method for each instance variable. Provide a method
    displayDate that displays the month, day and year separated by forward slashes (/).
    Write a test app named DateTest that demonstrates class Date’s capabilities.
 */

public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor to initialize the date (assumes valid input)
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setter and Getter for month
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    // Setter and Getter for day
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    // Setter and Getter for year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Method to display date in MM/DD/YYYY format
    public void displayDate() {
        System.out.printf("%02d/%02d/%d%n", month, day, year);
    }
}
