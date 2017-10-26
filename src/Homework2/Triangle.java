package Homework2;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private Point pt[] = new Point[3];
    private double a;
    private double b;
    private double c;


    public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        super();
        this.pt[0] = new Point(aX, aY);
        this.pt[1] = new Point(bX, bY);
        this.pt[2] = new Point(cX, cY);

        a = this.pt[0].getLenght(pt[1]);
        b = this.pt[1].getLenght(pt[2]);
        c = this.pt[2].getLenght(pt[0]);

    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.pt[0] = point1;
        this.pt[1] = point2;
        this.pt[2] = point3;

        a = this.pt[0].getLenght(pt[1]);
        b = this.pt[1].getLenght(pt[2]);
        c = this.pt[2].getLenght(pt[0]);
    }

    public double getPerimetr() {
        return a + b + c;
    }

    public double getSquare() {
        double perimetr = this.getPerimetr() / 2;
        return sqrt(perimetr * (perimetr - this.a) * (perimetr - this.b) * (perimetr - this.c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                 Arrays.toString(pt) +

                '}';
    }
}
