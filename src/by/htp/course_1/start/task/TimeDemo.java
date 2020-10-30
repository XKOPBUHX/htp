package by.htp.course_1.start.task;

public class TimeDemo {
    public static void main(String[] args) {
        TimeInterval firstInterval = new TimeInterval(1, 10, 30);
        firstInterval.printData();
        System.out.println(firstInterval.totalSeconds());

        TimeInterval secondInterval = new TimeInterval(4230);
        secondInterval.printData();
        System.out.println(secondInterval.totalSeconds());

        TimeInterval sum = TimeInterval.sum(firstInterval, secondInterval);
        sum.printData();
        System.out.println(sum.totalSeconds());

        sum = TimeInterval.sum(firstInterval, secondInterval, firstInterval, firstInterval, secondInterval);
        sum.printData();
        System.out.println(sum.totalSeconds());
    }
}
