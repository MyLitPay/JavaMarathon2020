package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfLevels = Integer.parseInt(scanner.nextLine());

        if (countOfLevels >= 1 && countOfLevels <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (countOfLevels >= 5 && countOfLevels <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (countOfLevels >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
