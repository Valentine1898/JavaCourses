package task2;

import static java.lang.Math.sqrt;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private double perimetr;

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.perimetr = perimetr(side1, side2, side3);

    }

    private double perimetr(float a, float b, float c) {
        return (a + b + c) / 2;

    }

    public double square() {
        if (this.checkSides()) {
            double square = sqrt(perimetr * (perimetr - side1) * (perimetr - side2) * (perimetr - side3));
            return square;
        } else
            System.out.println(this.toString() + " does not exist");
        return -1;

    }

    private boolean checkSides() {
        if (this.side1 > 0 && this.side2 > 0 && this.side3 > 0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
