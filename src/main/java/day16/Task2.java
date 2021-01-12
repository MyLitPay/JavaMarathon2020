package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("src/main/java/day16/file1.txt");
        File file2 = new File("src/main/java/day16/file2.txt");

        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);

        int counter = 0;
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            int num = (int) (Math.random() * 100);
            pw1.println(num);
            sum += num;
            counter++;

            if (counter == 20) {
                double res = (double) sum / counter;
                pw2.println(res);
                sum = 0;
                counter = 0;
            }
        }

        pw1.close();
        pw2.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNextLine()) {
            sum += Double.parseDouble(scanner.nextLine());
        }
        scanner.close();

        System.out.println((int) sum);
    }
}
