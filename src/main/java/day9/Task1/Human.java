package day9.Task1;

public class Human {
    public String name;

    public void name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }

}


