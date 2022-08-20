package day9.Task2;

public class Rectangle extends Figure {
    double width;
    double height;
//    String color;

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

    public Rectangle (String color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;


    }

}
