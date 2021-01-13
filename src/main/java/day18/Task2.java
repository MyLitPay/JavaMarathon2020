package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(-1123780));
    }

    public static int count7(int num) {
        int count = 0;
        String strNum = String.valueOf(num);
        if (strNum.contains("7") && !strNum.contains("-")) {
            count++;
            int newNum = Integer.parseInt(strNum.replaceFirst("7", ""));
            count += count7(newNum);
        }
        return count;
    }
}
