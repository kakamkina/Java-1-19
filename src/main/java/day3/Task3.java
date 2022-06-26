package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        for (double i=0; i<5; i++){
            double a = s.nextDouble();
            double b = s.nextDouble();

            if(b==0) {
                System.out.println("Деление на 0");
            }

            double result = a/b;
            System.out.println(result);
            continue;


        }

    }
}
