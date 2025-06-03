package chapter16.examples;

// Fig. 8.5: Time2.java
// Time2 class declaration
public class Time2 {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public Time2(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter methods
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    // String representation in universal-time format (HH:MM:SS)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second,
                (hour < 12 ? "AM" : "PM"));
    }
}
