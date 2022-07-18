package day9.Task1;

public class Student extends Human {
    public String groupName;

    public Student(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }

}

