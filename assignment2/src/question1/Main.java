package question1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: "+
                student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());
        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+
                student2.printRoll());
        System.out.println(" Name of the second student: "+ student2.printName());
    }
}
