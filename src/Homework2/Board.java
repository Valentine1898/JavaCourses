package Homework2;

import java.util.Arrays;

public class Board {
    private Shape part[] = new Shape[4];

    public Board() {
    }

    public void addShape(int i ,Shape shape) {
        if (i>0 && i<5 && this.part[i-1] == null){
            part[i-1] = shape;
        }
        else
            System.out.println("The board space is already taken or the index is incorrect");
    }

    public void deleteShape(int i) {
        if (i>0 && i<5 && this.part[i-1] != null) {
            this.part[i-1] = null;
        }
    }

    private double getSumSquare(){
        double sum = 0;
        for (int i = 0; i <4 ; i++) {
            if (this.part[i] != null) {
                sum += this.part[i].getSquare();
            }

        }
        return sum;
    }

    @Override
    public String toString() {
        return "Board{" +
                "part=" + Arrays.toString(part) +
                ", sumSquare=" + this.getSumSquare() +
                '}';
    }
}
