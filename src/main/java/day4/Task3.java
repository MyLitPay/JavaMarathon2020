package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];

        int maxSum = 0;
        int sum = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                sum += arr[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println(index);
    }
}
