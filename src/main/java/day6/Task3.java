package day6;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Student student1 = new Student();
        teacher1.setName("Mr. Life");
        teacher1.setSubject("Life science");
        student1.setName("Kamkina Karina Aleksandrovna");
        teacher1.setEvaluate(student1.name);
        teacher1.getEvaluate();
    }
}

class Student{
    static String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher extends Student {
    Student student = new Student();

    String name;
    String subject;
    int evaluate;
    private Teacher student1;

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setEvaluate(String name) {
        Random random = new Random();
        this.evaluate = random.nextInt((5 - 3) + 1) + 3;
    }

    public int getEvaluate() {
        System.out.println("Преподаватель "+name+" оценил студента с именем "+Student.name+" по предмету "+subject+" на оценку "+evaluate+".");
        return evaluate;

    }
}

