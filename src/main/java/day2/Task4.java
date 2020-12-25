package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());

        System.out.println(result(x));
    }

    public static double result(double x) {
        if (x >= 5) {
            return ((Math.pow(x, 2)) - 10) / (x + 7);
        } else if (x > -3) {
            return (x + 3) * ((Math.pow(x, 2)) - 2);
        } else {
            return 420.0;
        }
    }
}
