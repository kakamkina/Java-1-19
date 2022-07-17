package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Toyota");
        car1.setColor("Black Mamba");
        car1.setYear(1980);


        System.out.println("Модель: " + car1.getModel());
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Год выпуска: " + car1.getYear());
    }
    }
       class Car {
            private String model;
            private String color;
            private int year;

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
        }


