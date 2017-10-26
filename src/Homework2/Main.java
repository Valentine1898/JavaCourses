package Homework2;

public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point(0, 0);
        Point pt2 = new Point(2, 2);
        Point pt3 = new Point(4, 0);

        Triangle tr = new Triangle(pt1, pt2, pt3);
        Circle circle = new Circle(pt1,pt2);
        Quadrate qt = new Quadrate(pt1, pt2);

        Board board = new Board();

        board.addShape(1, tr);
        board.addShape(3, circle);
        board.addShape(4, qt);
        System.out.println(board);
    }
}
