package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int inputNumber = s.nextInt();
        int[] numbers = new int[inputNumber];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println(numbers[i]);
        }
        int length = 0;
        int equalsOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int y : numbers) {
            sum = sum + y;

            if(y > 8) {
                length++;
                break;
            }
            if(y==1){
                equalsOne++;
                break;
            }
            if(y%2==0){
                even++;
                break;
            }
            if(y%2!=0){
                odd++;
                break;
            }
        }

        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + inputNumber);
        System.out.println("Количество чисел больше 8: " + length);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }


}

