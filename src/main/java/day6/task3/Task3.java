package day6.task3;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Tom");
        Teacher teacher = new Teacher("Jason", "History");
        teacher.evaluate(student);
    }
}
