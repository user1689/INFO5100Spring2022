package question1;

public class Student {
    String name;
    int studentID;
    int gpa;
    Class c;

    public Student() {
        this.name = "default";
        this.studentID = -1;
        this.gpa = -1;
        this.c = null;
    }

    public Student(Student student) {
        this.name = student.getName();
        this.studentID = student.getStudentID();
        this.gpa = student.getGpa();
        this.c = new Class(-1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public Class getC() {
        return c;
    }

    public void setC(Class c) {
        this.c = c;
    }

    public void printStudentInfo() {
        System.out.println("name:" + this.getName());
        System.out.println("id: " + this.getStudentID());
        System.out.println("gpa: "  + this.getGpa());
        System.out.println("class: " + this.getC().getId());

    }
}
