package java.homework.task1;

import java.awt.*;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private Color color;
    private boolean sleep;

    public Cat(String name, int age, String breed, Color color) {

        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.sleep = false;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public void goToSleep() {
        if(!this.sleep)
            this.sleep = true;
    }

    public void wakeUp() {
        if (this.sleep)
            this.sleep = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color=" + color +
                ", sleep=" + sleep +
                '}';
    }
}
