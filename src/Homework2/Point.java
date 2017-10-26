package Homework2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLenght(Point point) {
        return sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2));

    }

    public boolean isEqual(Point point) {
        if (this == point) {
            System.out.println("These point is equal");
            return true;
        } else
            return false;
    }

    public boolean isEqual(Point point1, Point point2) {
        if (this == point1 || this == point2 || point1 == point2) {
            System.out.println("These point is equal");
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
