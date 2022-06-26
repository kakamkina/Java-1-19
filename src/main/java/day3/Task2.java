package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();

        for (double i = a; b>0;){
            double result = a/b;
            System.out.println(result);
            System.exit(0);

            if(b==0)
                break;
        }

    }
}
