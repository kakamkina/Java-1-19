package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();

        airplane1.setManufacturer("Mother Mary");
        airplane1.setYear(1990);
        airplane1.setLength(49);
        airplane1.setWeight(100);
        airplane1.setFillUp(5);
        airplane1.setFillUp(10);
        airplane1.info();

    }
}
class Airplane {

    String manufacturer;
    int year;
    int length;
    int weight;
    int fuel;
    int fillUp;
    int n;

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

    public void info(){

        System.out.println("Изготовитель: "+manufacturer+", год выпуска: "+year+" , длина: "+length+", вес: "+weight+", количество топлива в баке: "+fillUp);

    }
    public void setFillUp(int n) {
        this.fillUp = fillUp;
        fillUp = fillUp + n;
    }

    public int getFillUp() {
//        fillUp = fillUp + n;

        return fillUp;
    }
}