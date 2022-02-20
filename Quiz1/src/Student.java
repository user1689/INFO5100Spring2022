public class Student extends Person{

    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    public void takeQuiz(String b) {
        System.out.println("I am taking quiz now");
    }
}
