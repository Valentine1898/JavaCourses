package task2;

public class Main {
    public static void main(String[] args) {
    Triangle triangle1 = new Triangle(25, 26, 27);
    Triangle triangle2 = new Triangle(-7, 0 ,25 );
    Triangle triangle3 = new Triangle(1,1,1);
    double sq1 = triangle1.square();
    double sq2 = triangle2.square();
    double sq3 = triangle3.square();
    System.out.println(sq1);
    System.out.println(sq2);
    System.out.println(sq3);

    }
}
