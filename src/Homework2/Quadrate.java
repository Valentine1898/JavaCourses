package Homework2;

import java.util.Arrays;

public class Quadrate extends Shape {
    private Point pt[] = new Point[2];
    private double diag;

    public Quadrate(Point point1, Point point2) {
        if(check(point1,point2)) {
            this.pt[0] = point1;
            this.pt[1] = point2;
            diag = this.pt[0].getLenght(this.pt[1]);
        }


    }
    private static boolean check(Point point1, Point point2){
        if (point1.getX()-point2.getX() == point1.getY() - point2.getY()){
            return true;
        }
        else {
            System.out.println("Error, is not quadrate");
            return false;
        }

    }

    @Override
    public double getPerimetr() {
        double perimetr;
        perimetr = 4 * (Math.sqrt(this.diag)) / 2;
        return perimetr;
    }

    @Override
    public double getSquare() {
        return Math.pow(diag,2) / 2;
    }

    @Override
    public String toString() {
        return "Quadrate{" +
                "pt=" + Arrays.toString(pt) +
                ", diag=" + diag +
                '}';
    }
}