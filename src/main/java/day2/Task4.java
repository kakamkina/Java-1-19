package day2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y;

        if(x >= 5){
            y = (pow(x, 2) - 10) / (x + 7);
        }
        else if(-3 < x && x < 5){
            y = (x+3)*(pow(x,2)-2);
        }
        else{
            y = 420;
        }
        System.out.println(y);
    }
}
