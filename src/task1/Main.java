package task1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mark", 4 , "british", Color.gray );
        Cat cat2 = new Cat("Villem", 5, "british", Color.BLUE );
        cat1.setAge(5);
        cat2.setName("Hank");
        cat1.goToSleep();
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
