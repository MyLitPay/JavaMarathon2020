package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        int maxSum = 0;
        int sum;
        int index = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(index);
    }
}
