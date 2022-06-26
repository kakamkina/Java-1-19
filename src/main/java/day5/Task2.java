package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("BMW","Yellow", 2022);
        System.out.println("Model: " + motorbike1.getModel());
        System.out.println("Color: " + motorbike1.getColor());
        System.out.println("Year: " + motorbike1.getYear());
    }
}

class Motorbike{
    String model;
    String color;
    int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
