package chapter8.exercises;
/*
Exercise: 8.5 (Modifying the Internal Data Representation of a Class) It would be perfectly reasonable
for the Time2 class of Fig. 8.5 to represent the time internally as the number of seconds since midnight rather than the three integer values hour, minute and second. Clients could use the same public methods and get the same results. Modify the Time2 class of Fig. 8.5 to implement the time as
the number of seconds since midnight and show that no change is visible to the clients of the class.
 */

public class ModifiedTime2 {

    private int totalSeconds; // internal representation: seconds since midnight

    // No-arg constructor
    public ModifiedTime2() {
        this(0, 0, 0);
    }

    // Constructor with hour
    public ModifiedTime2(int hour) {
        this(hour, 0, 0);
    }

    // Constructor with hour and minute
    public ModifiedTime2(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Constructor with hour, minute, second
    public ModifiedTime2(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        totalSeconds = toTotalSeconds(hour, minute, second);
    }

    // Copy constructor
    public ModifiedTime2(ModifiedTime2 time) {
        this.totalSeconds = time.totalSeconds;
    }

    // Set Methods

    public void setTime(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        totalSeconds = toTotalSeconds(hour, minute, second);
    }

    public void setHour(int hour) {
        validateTime(hour, getMinute(), getSecond());
        totalSeconds = toTotalSeconds(hour, getMinute(), getSecond());
    }

    public void setMinute(int minute) {
        validateTime(getHour(), minute, getSecond());
        totalSeconds = toTotalSeconds(getHour(), minute, getSecond());
    }

    public void setSecond(int second) {
        validateTime(getHour(), getMinute(), second);
        totalSeconds = toTotalSeconds(getHour(), getMinute(), second);
    }

    // Get Methods
    public int getHour() {
        return totalSeconds / 3600;
    }

    public int getMinute() {
        return (totalSeconds % 3600) / 60;
    }

    public int getSecond() {
        return totalSeconds % 60;
    }

    // String Representations
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        int hour = getHour();
        return String.format("%d:%02d:%02d %s",
                (hour == 0 || hour == 12) ? 12 : hour % 12,
                getMinute(), getSecond(),
                hour < 12 ? "AM" : "PM");
    }

    // Utility methods

    private int toTotalSeconds(int hour, int minute, int second) {
        return hour * 3600 + minute * 60 + second;
    }

    private void validateTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
    }
} //end class ModifiedTime2

class ModifiedTime2Test {
    public static void main(String[] args) {
        ModifiedTime2 t1 = new ModifiedTime2(13, 45, 30);
        System.out.println("Universal: " + t1.toUniversalString());
        System.out.println("Standard : " + t1.toString());

        t1.setHour(23);
        t1.setMinute(59);
        t1.setSecond(59);
        System.out.println("Modified: " + t1.toUniversalString() + " | " + t1.toString());

        ModifiedTime2 t2 = new ModifiedTime2(t1);
        System.out.println("Copy     : " + t2.toUniversalString() + " | " + t2.toString());
    }
}

