package day9.Task2;

public abstract class Figure {
    private static String color;

    public Figure (String color){
        this.color = color;
    }

//    public void color(String color) {
//        this.color = color;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();

//
}


