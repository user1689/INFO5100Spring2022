package question1;

public class deepCopyShallowCopyTest {

    public static void main(String[] args) {
        Class c1 = new Class(8);
        Student sample = new Student();
        Student leo = new Student(sample);
        leo.setName("leo");
        leo.setGpa(99);
        leo.setStudentID(123);
        leo.setC(c1);

        Student sam = new Student(sample);
        sam.setName("sam");
        sam.setGpa(100);
        sam.setStudentID(321);
        sam.setC(c1);

        leo.printStudentInfo();
        sam.printStudentInfo();
    }

}
