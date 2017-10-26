package Homework2;

public class Circle extends Shape {
    private Point center;
    private Point point;

    public Circle(Point center, Point point) {
        this.center = center;
        this.point = point;
    }

    public Circle() {
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * this.center.getLenght(point);
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(this.center.getLenght(point), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }
}
