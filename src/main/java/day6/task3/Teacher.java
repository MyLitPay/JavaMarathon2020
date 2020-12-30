package day6.task3;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int num = (int) Math.round (2 + Math.random() * 3);
        String mark = "";

        switch (num) {
            case 2 : mark = "неудовлетворительно";
            break;
            case 3 : mark = "удовлетворительно";
            break;
            case 4 : mark = "хорошо";
            break;
            case 5 : mark = "отлично";
            break;
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " +
                student.getName() + " по предмету " +
                subject + " на оценку " + mark + ".");
    }
}
