package Homework3;

import java.util.*;

public class Group {
    private int id;
    private Student student[] = new Student[10];

    public Group() {
    }

    public void addStudent(Student student) throws MyException {
        if (student != null) {
            int i = 0;
            while (this.student[i] != null) {
                i++;
                if (i == 10)
                    throw new MyException();
            }
            this.student[i] = student;
        } else {
            System.out.println("student is null");
        }

    }

    public void deleteStudent(int i) {
        if (this.student[i - 1] != null && i >= 0 && i < 10) {
            this.student[i - 1] = null;
        } else
            System.out.println("Error. Student does not exist or index not supported ");
    }

    public Student findStudent(String name) {
        if (name != null) {
            for (int i = 0; i < 10; i++) {
                if (this.student[i] == null) {

                } else {
                    if (this.student[i].getName().equalsIgnoreCase(name))
                        return this.student[i];
                }
            }
        }
        return null;
    }

    private void sort() {
        for (int i = this.student.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (
                        this.student[j] != null &&
                                this.student[j + 1] != null &&
                                this.student[j].getName().compareTo(this.student[j + 1].getName()) > 0
                        ) {
                    Student tmp = this.student[j];
                    this.student[j] = this.student[j + 1];
                    this.student[j + 1] = tmp;

                }

            }
        }
    }

    @Override
    public String toString() {
        this.sort();
        return "Group{" +
                Arrays.toString(student) +
                '}';
    }
}

