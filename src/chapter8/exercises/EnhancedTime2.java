package chapter8.exercises;
/*
Exercise: 8.7 (Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that increments the time stored in a Time2 object by one second. Provide method incrementMinute to increment the minute by one and method incrementHour to increment the hour by one. Write a
program that tests the tick method, the incrementMinute method and the incrementHour method
to ensure that they work correctly. Be sure to test the following cases:
a) incrementing into the next minute,
b) incrementing into the next hour and
c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM)
*/


public class EnhancedTime2 {
    private int hour; // 0-23
    private int minute; // 0-59
    private int second; // 0-59

    // Time2 no-argument constructor:
    // initializes each instance variable to zero
    public EnhancedTime2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public EnhancedTime2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public EnhancedTime2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public EnhancedTime2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Time2 constructor: another Time2 object supplied
    public EnhancedTime2(EnhancedTime2 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("seconds must be 0-59");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // Tick method: increment seconds by 1
    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            incrementMinute();
        }
    }

    // Increment minute by 1
    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour();
        }
    }

    // Increment hour by 1
    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0;  // roll over to midnight (start of new day)
        }
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
} // end class EnhancedTime2

class EnhancedTime2Test {
    public static void main(String[] args) {
        // Case a) incrementing into the next minute:
        EnhancedTime2 time1 = new EnhancedTime2(7, 59, 59);
        System.out.println("Before tick: " + time1.toUniversalString());
        time1.tick();
        System.out.println("After tick:  " + time1.toUniversalString()); // expected 08:00:00

        // Case b) incrementing into the next hour:
        EnhancedTime2 time2 = new EnhancedTime2(11, 59, 15);
        System.out.println("\nBefore incrementMinute: " + time2.toUniversalString());
        time2.incrementMinute();
        System.out.println("After incrementMinute:  " + time2.toUniversalString()); // expected 12:00:15

        // Case c) incrementing into the next day:
        EnhancedTime2 time3 = new EnhancedTime2(23, 59, 59);
        System.out.println("\nBefore tick: " + time3.toUniversalString());
        time3.tick();
        System.out.println("After tick:  " + time3.toUniversalString()); // expected 00:00:00

        // Additional check: incrementHour from 23 to 0
        EnhancedTime2 time4 = new EnhancedTime2(23, 45, 30);
        System.out.println("\nBefore incrementHour: " + time4.toUniversalString());
        time4.incrementHour();
        System.out.println("After incrementHour:  " + time4.toUniversalString()); // expected 00:45:30
    }
} // end class EnhancedTime2Test