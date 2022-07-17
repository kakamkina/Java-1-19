package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(1 + " ");
        for (int a = 2; a < 20001; a++) {
            sb.append(+a + " ");
        }
        System.out.println(sb);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        long startTime1 = System.currentTimeMillis();
        for (int a = 0; a < 20000; a++) {
            System.out.print(a + " ");
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
    }
}
