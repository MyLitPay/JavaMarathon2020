package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int counter = a;

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (counter < b) {
                counter++;
                if (counter % 5 == 0 && counter % 10 != 0) {
                    System.out.print(counter + " ");
                }
            }
        }
    }
}
