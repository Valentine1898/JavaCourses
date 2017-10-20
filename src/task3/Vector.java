package task3;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static Vector sum(Vector vector1, Vector vector2) {
        Vector sum = new Vector();
        sum.setX(vector1.x + vector2.x);
        sum.setY(vector1.y + vector2.y);
        sum.setZ(vector1.z + vector2.z);
        return sum;
    }

    public Vector sum(Vector vector) {
        this.setX(this.x + vector.x);
        this.setY(this.y + vector.y);
        this.setZ(this.z + vector.z);
        return this;
    }

    public static double scalarComposition(Vector vector1, Vector vector2) {
        return (vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z);
    }

    public double scalarComposition(Vector vector) {
        return (this.x * vector.x + this.y * vector.y + this.z * vector.z);
    }

    public static Vector vectorComposition(Vector vector1, Vector vector2) {
        Vector composition = new Vector();
        composition.setX(vector1.y * vector2.z - vector1.z * vector2.y);
        composition.setY(vector1.z * vector2.x - vector1.x * vector2.z);
        composition.setZ(vector1.x * vector2.y - vector1.y * vector2.x);
        return composition;
    }

    public Vector vectorComposition(Vector vector) {
        Vector composition = new Vector();
        composition.setX(this.y * vector.z - this.z * vector.y);
        composition.setY(this.z * vector.x - this.x * vector.z);
        composition.setZ(this.x * vector.y - this.y * vector.x);
        return composition;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "( " + x +
                "; " + y +
                "; " + z +
                " ) }";
    }
}
