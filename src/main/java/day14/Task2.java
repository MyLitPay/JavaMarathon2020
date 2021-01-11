package day14;

import org.w3c.dom.events.EventException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    static File people = new File("src/main/java/day14/people.txt");

    public static void main(String[] args) {
//        parseFileToStringList(people);
        System.out.println(parseFileToStringList(people));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                list.add(s);

                String[] array = s.split(" ");
                int age = Integer.parseInt(array[1]);

                if (age < 0) {
                    throw new IllegalArgumentException();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            return new ArrayList<>();
        }

        return list;

    }
}
