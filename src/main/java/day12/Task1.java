package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("Mercedes");
        list.add("Ford");
        list.add("Skoda");
        list.add("Toyota");

        System.out.println(list);

        list.add(3, "Ferrari");
        list.remove(0);

        System.out.println(list);

    }
}
