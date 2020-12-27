package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int counter = 0;
        int sum = 0;

        for (int x : arr) {
            if (x > max) {
                max = x;
            }

            if (x < min) {
                min = x;
            }

            String strNum = String.valueOf(x);
            if (strNum.endsWith("0")) {
                counter++;
                sum+= x;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Ends with 0: " + counter);
        System.out.println("Sum: " + sum);

    }
}
