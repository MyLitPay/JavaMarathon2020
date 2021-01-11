package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    static File file = new File("src/main/java/day14/some.txt");

    public static void main(String[] args) {
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        int sum = 0;
        int counter = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
                counter += 1;
            }
            if (counter != 10) {
                throw new RuntimeException("Некорректный входной файл");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
        }

        System.out.println(sum);
    }
}
