package day9.Task2;

public class Rectangle extends Figure {
    int width;
    int height;

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Rectangle (int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

}
