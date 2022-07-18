package day9.Task2;

public class Triangle extends Figure {
    int length1;
    int length2;
    int length3;

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Triangle (int length1, int length2, int length3, String color){
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.color = color;
    }


}
