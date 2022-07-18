package day9.Task2;

public class Circle extends Figure {
    int circleRadius;

    @Override
    public double area() {
        double area = Math.PI*(Math.pow(circleRadius, 2));
        return area;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public Circle (int circleRadius, String color){
        this.circleRadius = circleRadius;
        this.color = color;
    }
}

