package Homework3;

public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[12];
        Group group = new Group();

        students[0] = new Student("avjj", 25, 99, 33, true, 2, 4.8);
        students[1] = new Student("lv", 18, 99, 33, true, 2, 4.6);
        students[2] = new Student("crtkkk", 37, 99, 33, true, 2, 4.3);
        students[3] = new Student("tgf", 27, 99, 33, true, 2, 3.8);
        students[4] = new Student("bln", 24, 99, 33, true, 2, 3.6);
        students[5] = new Student("ret", 23, 99, 33, true, 2, 2.5);
        students[6] = new Student("lmb", 22, 99, 33, true, 2, 5.0);
        students[7] = new Student("por", 21, 99, 33, true, 2, 4.9);
        students[8] = new Student("qwe", 28, 99, 33, true, 2, 4.7);
        students[9] = new Student("cds", 19, 99, 33, true, 2, 3.0);
        students[10] = new Student("jkk", 34, 99, 33, true, 2, 3.7);
        students[11] = new Student("zxc", 25, 99, 33, true, 2, 3.2);

        try {
            for (int i = 0; i < 8; i++) {
                group.addStudent(students[i]);


            }
        } catch (MyException e) {
            e.printStackTrace();
        }
//        try {
//            group.addStudentInteractive();
//        } catch (MyException e) {
//            e.printStackTrace();
//        }

        System.out.println(group);

        group.deleteStudent(2);
        group.deleteStudent(5);

        group.newSort(6);

        System.out.println(group);

        System.out.println(group.findStudent("bln"));


    }
}
