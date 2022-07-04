package day7;


public class Task1 {
    public static void main(String[] args) {



    }

    static class Airplane {

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

            System.out.println("Èçãîòîâèòåëü: "+manufacturer+", ãîä âûïóñêà: "+year+" , äëèíà: "+length+", âåñ: "+weight+", êîëè÷åñòâî òîïëèâà â áàêå: "+fillUp);

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
}