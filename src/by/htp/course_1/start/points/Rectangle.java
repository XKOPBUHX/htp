package by.htp.course_1.start.points;

public class Rectangle {
    private final Point upperLeftCorner;
    private final Point lowerRightCorner;

    public Rectangle(Point upperLeftCorner, Point lowerRightCorner) {
        this.upperLeftCorner = upperLeftCorner;
        this.lowerRightCorner = lowerRightCorner;
    }

    public double diagonal() {
        return upperLeftCorner.distance(lowerRightCorner);
    }

    public double area() {
        return Math.abs(upperLeftCorner.getX() - lowerRightCorner.getX())
                * Math.abs(upperLeftCorner.getY() - lowerRightCorner.getY());
    }
}
