package day9.Task2;

public class Circle extends Figure {
    double circleRadius;
//    String color;

    @Override
    public double area() {
        double area = Math.PI*(Math.pow(circleRadius, 2));
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2*Math.PI*circleRadius;
        return perimeter;
    }

    public Circle (String color, int circleRadius){
        super(color);
        this.circleRadius = circleRadius;
    }
}

