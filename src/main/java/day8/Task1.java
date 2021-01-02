package day8;

public class Task1 {
    public static void main(String[] args) {
        long time0 = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }
        long time1 = System.currentTimeMillis() - time0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }

        long time2 = System.currentTimeMillis() - time0 - time1;

        System.out.println(str);
        System.out.println(sb.toString());
        System.out.println("Concatenation: " + time1 + " mls");
        System.out.println("StringBuilder: " + time2 + " mls");
    }
}
