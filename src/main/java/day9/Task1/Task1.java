package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "Z12");
        Teacher teacher = new Teacher("Fred", "Physics");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
