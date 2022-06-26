package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int[] numbers = new int[x];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println(numbers[i]);
        }
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int y : numbers) {
            e = e + y;

            for (int r = y; y > 8;) {
                a++;
                break;
            }
            for (int r = y; y==1;){
                b++;
                break;
            }
            for (int r = y; y%2==0;){
                c++;
                break;
            }
            for (int r = y; y%2!=0;){
                d++;
                break;
            }
        }

        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + x);
        System.out.println("Количество чисел больше 8: " + a);
        System.out.println("Количество чисел равных 1: " + b);
        System.out.println("Количество четных чисел: " + c);
        System.out.println("Количество нечетных чисел: " + d);
        System.out.println("Сумма всех элементов массива: " + e);

    }


}

