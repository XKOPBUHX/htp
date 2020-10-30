package by.htp.course_1.start.task;

import java.util.Arrays;

public class TimeInterval {

    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTES_IN_HOUR;

    private final int hours;
    private final int minutes;
    private final int seconds;

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / SECONDS_IN_HOUR;
        this.minutes = totalSeconds % SECONDS_IN_HOUR / MINUTES_IN_HOUR;
        this.seconds = totalSeconds % SECONDS_IN_MINUTE;
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int totalSeconds() {
        return hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
    }

    public void printData() {
        System.out.println(hours + "h, " + minutes + "m, " + seconds + "s");
    }

    public static TimeInterval sum(TimeInterval first, TimeInterval second) {
        return new TimeInterval(first.totalSeconds() + second.totalSeconds());
    }

    public static TimeInterval sum(TimeInterval ... intervals) {
        return new TimeInterval(
                Arrays.stream(intervals)
                        .mapToInt(TimeInterval::totalSeconds)
                        .sum()
        );
    }
}
