package by.htp.course_1.start.points;

public class PointsDemo {
    public static void main(String[] args) {
        Point first = new Point(0,0);
        Point second = new Point(3,4);

        Rectangle rectangle = new Rectangle(first, second);
        System.out.println(rectangle.diagonal());
        System.out.println(rectangle.area());
    }
}
