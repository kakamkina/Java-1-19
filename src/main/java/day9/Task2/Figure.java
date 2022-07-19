package day9.Task2;

public abstract class Figure {
    public static String color;
    public static double perimeter;

    public void color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
    public abstract double perimeter();

}

