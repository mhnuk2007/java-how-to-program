package chapter10.exercises.payablehierarchy;


public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("Month must be 1–12");
        if (day <= 0 || day > 31)
            throw new IllegalArgumentException("Day must be 1–31");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
