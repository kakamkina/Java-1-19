package day9.Task2;

public abstract class Figure {

    public String color;

    public void color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
    public abstract double perimeter();

}

