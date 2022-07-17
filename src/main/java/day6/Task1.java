package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Washing Machine");
        car1.setColor("Bubble blue");
        car1.setYear(1995);
        car1.setYearDifference(2022);
        car1.info();
        System.out.println("Model: "+ car1.getModel()+", Color: "+car1.getColor()+", Year of produce: "
                +car1.getYear()+", Current year: "+car1.getYearDifference()+", Difference: " + car1.getInputYear());
    }
}

class Car {
    String model;
    String color;
    int year;
    int yearDifference;
    int inputYear;

    public Car() {
    }

    public void setModel(String userModel) {
        model = userModel;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String userColor) {
        color = userColor;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int userYear) {
        year = userYear;
    }

    public int getYear() {
        return year;
    }

    void info() {
        System.out.println("Car");
    }

    public int getYearDifference() {
        return yearDifference;
    }

    public void setYearDifference(int yearDifference) {
        this.yearDifference = yearDifference;
    }

    public int getInputYear() {
        inputYear = year - yearDifference;
        if (inputYear > 0){
            return inputYear;
        }
        else{
            inputYear = inputYear * (-1);
        }
        return inputYear;
    }

    public void setInputYear(int inputYear) {
        this.inputYear = inputYear;
    }
}

