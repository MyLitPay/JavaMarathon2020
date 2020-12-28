package day5.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2005);
        car.setColor("blue");
        car.setModel("Ford");

        System.out.println(car.getColor() + " " + car.getModel() + " "
        + car.getYear() + " year");
    }
}
