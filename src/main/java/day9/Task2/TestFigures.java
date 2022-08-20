package day9.Task2;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
//
        };
        System.out.println(TestFigures.calculateRedPerimeter(figures));
        System.out.println(TestFigures.calculateRedArea(figures));


//        System.out.println(calculateRedPerimeter(figures));
//        public static double calculateRedPerimeter(Figure[] figures){}
//        public static double calculateRedArea(Figure[] figures)
    }


    public static double calculateRedPerimeter(Figure[] figures) {
        double perimeter = 0;

        for (int i = 0; i < figures.length; i++) {

            if ("Red".equals(figures[i].getColor()))
                perimeter += figures[i].perimeter();

        }

        System.out.print("Сумма периметров красных фигур = ");
        return perimeter;
    }


    public static double calculateRedArea(Figure[] figures) {

        double area = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                area += figure.area();

        }

        return area;
    }
}


