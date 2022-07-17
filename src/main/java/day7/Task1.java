package day7;

import static day7.Task1.Airplane.compareAirplanes;

public class Task1 {
    public static void main(String[] args) {
        compareAirplanes();
    }

    static class Airplane {

        String manufacturer;
        int year;
        int length;
        int weight;
        int fuel;
        int fillUp;

        static void compareAirplanes() {
            Airplane airplane1 = new Airplane();
            Airplane airplane2 = new Airplane();
            airplane1.setLength(49);
            airplane2.setLength(60);
            int a = airplane1.getLength();
            int b = airplane2.getLength();

            if (a > b) {
                System.out.println("Airplane 1 is longer (" + a + "cm)");
            }
            if (b > a)
                System.out.println("Airplane 2 is longer (" + b + "cm)");
            else {
                System.out.println("Equals");
            }
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

        public int getLength() {
            return length;
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

        public void info() {

            System.out.println("Изготовитель:: " + manufacturer + ", год выпуска: " + year + " , длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fillUp);

        }

        public void setFillUp(int n) {
            this.fillUp = fillUp;
            fillUp = fillUp + n;

        }

        public int getFillUp() {
            return fillUp;
        }
    }
}
