package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int[][] arr = new int[12][8];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {

                arr[i][k] = rand.nextInt(50);
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }

        int a;
//        int[] sumArr = new int[12]; //

        int sum = 0;
        for (a = 0; a < 12; a++) {
            sum = 0;
            for (int j = 0; j < 8; j++) {
               sum = sum + arr[a][j];
//                sumArr[sum] = in.nextInt(); //

//                for(int k =0; k< sumArr.length; k++) {
//                    Arrays.fill(sumArr, sum);
//                }
            }
            System.out.print(" " + sum);
        }

//        int max = Arrays.stream(sum).max().getAsInt();
//        System.out.println("max " + max);
//        for (int i = 0; i < sum.length; i++) {
//            System.out.print(sumArr[i] + " ");
//        }
    }
}