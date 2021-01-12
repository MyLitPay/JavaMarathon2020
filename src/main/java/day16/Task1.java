package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("src/main/java/day16/some.txt"));
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int sum = 0;
            int counter = 0;

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                counter++;
            }

            double result = (double) sum / counter;

            System.out.println(result + " --> " +
                    new BigDecimal(result).setScale(3, RoundingMode.HALF_UP));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

