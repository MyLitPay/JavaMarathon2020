package day5.task2;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2012, "grey", "Yamaha");

        System.out.println(motorbike.getColor() + " " + motorbike.getModel() + " "
        + motorbike.getYear() + " year");
    }
}
