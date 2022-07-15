package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (;;) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            if (b > 0) {
                double result = a / b;
                System.out.println(result);
                continue;
            }
            if (b == 0) {
                System.out.println("Деление на 0");
                break;
            }
        }

    }
}

