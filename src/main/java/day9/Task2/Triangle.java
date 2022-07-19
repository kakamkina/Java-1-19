package day9.Task2;

public class Triangle extends Figure {
    int lengthA;
    int lengthB;
    int lengthC;

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

    public Triangle (int lengthA, int lengthB, int lengthC, String color){
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.color = color;
    }


}
