package question1;

public class Student {
    private int rollNumbder;
    private String name;

    public Student(int x, String name) {
        this.rollNumbder = x;
        this.name = name;
    }

    public Student(Student s) {
        this.rollNumbder = s.rollNumbder;
        this.name = s.name;
    }

    public int printRoll() {
        return this.rollNumbder;
    }

    public String printName() {
        return this.name;
    }
}
