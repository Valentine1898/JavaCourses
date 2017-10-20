package task3;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5, -3, 1);
        Vector vector2 = new Vector(-2, 0, 1);

        System.out.println("scalar composition = " +Vector.scalarComposition(vector1,vector2));
        System.out.println(Vector.sum(vector1, vector2));
        System.out.println(Vector.vectorComposition(vector1,vector2));

        System.out.println(vector1.scalarComposition(vector2));
        System.out.println(vector1.sum(vector2));
        System.out.println(vector1.vectorComposition(vector2));

    }
}
