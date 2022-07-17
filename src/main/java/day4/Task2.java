package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            else if (arr[i] > largest)
                largest = arr[i];
        }

        int a = 0;
        int b = 0;

        for(int y:arr){
            b = b + y;

            if(y%10 ==0){
                b++;
            }

            if(y%10 ==0){
                a++;
            }
        }
        System.out.println("Наибольший элемент массива: " + largest);
        System.out.println("Наименьший элемент массива: " + smallest);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + a);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + b);
    }
}

