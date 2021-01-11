package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    static File people = new File("src/main/java/day14/people.txt");

    public static void main(String[] args) {
        System.out.println(parseFileToObjList(people));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();

                String[] array = s.split(" ");
                String name = array[0];
                int age = Integer.parseInt(array[1]);

                if (age < 0) {
                    throw new IllegalArgumentException();
                }

                list.add(new Person(name, age));

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
