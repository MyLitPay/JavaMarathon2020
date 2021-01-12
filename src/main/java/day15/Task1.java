package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");

        try (Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt")) {

            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] arr = s.split(";");

                if (arr[2].equals("0")) {
                    pw.println(s.replaceAll(";", ", "));
                }
            }
        }
    }
}
