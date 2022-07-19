package day9.Task2;

public class Rectangle extends Figure {
    int width;
    int height;

    @Override
    public double area() {
        double area = height*width;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2*(height+width);
        return perimeter;
    }

    public Rectangle (int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

}
