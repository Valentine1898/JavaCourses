package Lesson4;

public class Ball implements Play {
    private int size;
    private String color;

    public Ball(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Ball() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean canBroke() {
        return false;
    }

    @Override
    public String play() {
        return "Bac - Bac";
    }
}
