package day9.Task2;

public class Triangle extends Figure {
    double lengthA;
    double lengthB;
    double lengthC;
//    String color;

    @Override
    public double area() {
        double spTriangle = (lengthA+lengthB+lengthC)/2;
        double area = Math.sqrt(spTriangle*(spTriangle-lengthA)*(spTriangle-lengthB)*(spTriangle-lengthC));
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = lengthA+lengthB+lengthC;
        return perimeter;
    }

    public Triangle (String color, int lengthA, int lengthB, int lengthC){
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }


}
