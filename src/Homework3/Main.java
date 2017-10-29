package Homework3;

public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[12];
        Group group = new Group();

        students[0] = new Student("avjj", 25, 99, 33, true, 2);
        students[1] = new Student("lv", 25, 99, 33, true, 2);
        students[2] = new Student("crtkkk", 25, 99, 33, true, 2);
        students[3] = new Student("tgf", 25, 99, 33, true, 2);
        students[4] = new Student("bln", 25, 99, 33, true, 2);
        students[5] = new Student("ret", 25, 99, 33, true, 2);
        students[6] = new Student("lmb", 25, 99, 33, true, 2);
        students[7] = new Student("por", 25, 99, 33, true, 2);
        students[8] = new Student("qwe", 25, 99, 33, true, 2);
        students[9] = new Student("cds", 25, 99, 33, true, 2);
        students[10] = new Student("jkk", 25, 99, 33, true, 2);
        students[11] = new Student("zxc", 25, 99, 33, true, 2);

        try {
            for (int i = 0; i < 10; i++) {
                group.addStudent(students[i]);


            }
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println(group);

        group.deleteStudent(2);
        group.deleteStudent(5);

        System.out.println(group);

        System.out.println(group.findStudent("bln"));


    }
}
