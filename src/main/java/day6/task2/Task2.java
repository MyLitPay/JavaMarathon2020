package day6.task2;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2007, 42, 103000);

        airplane.setYear(2009);
        airplane.setLength(43);
        airplane.fillUp(30);
        airplane.fillUp(20);
        airplane.info();
    }
}
