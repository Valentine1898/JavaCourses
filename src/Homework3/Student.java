package Homework3;

public class Student extends Human {
    private int course;
    private String university;

    public Student(String name, int age, int weight, int height, boolean sex, int course) {
        super(name, age, weight, height, sex);
        this.course = course;
        this.university = "KPI";
    }

    public Student() {
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "{" +
                "course=" + course +
                "} " + super.toString();
    }
}
