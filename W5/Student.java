/**
 * Student
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }
}