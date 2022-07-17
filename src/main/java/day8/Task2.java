package day8;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        System.out.println(airplane);

    }
}

class Airplane {

    String manufacturer;
    int year;
    int length;
    int weight;
    int fuel;
    int fillUp;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
        fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFillUp(int n) {
        this.fillUp = fillUp;
        fillUp = fillUp + n;
    }

    public int getFillUp() {
        return fillUp;
    }

    public String toString() {
        return manufacturer + " " + year + " " + length + " " + weight;
    }
}
