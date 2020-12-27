package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int counter = 0;
        int countOfOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        for (int x : array) {
            if (x > 8) {
                counter++;
            }

            if (x == 1) {
                countOfOne++;
            }

            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += x;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + counter);
        System.out.println("Количество чисел равных 1: " + countOfOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
