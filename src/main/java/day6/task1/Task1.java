package day6.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike(2004, "black", "Yamaha");

        car.setYear(2005);
        car.info();
        System.out.println(car.yearDifference(2030));
        motorbike.info();
        System.out.println(motorbike.yearDifference(1990));
    }
}
