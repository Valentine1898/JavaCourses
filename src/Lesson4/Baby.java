package Lesson4;

public class Baby implements Comparable {
    private  String name;
    private String surname;
    private int age;

    public Baby(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Baby() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public void playWith(Play someThing) {
        System.out.println("I play with " + someThing + "   " + someThing.play());
        System.out.println(someThing.canBroke());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
