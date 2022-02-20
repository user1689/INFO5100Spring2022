public class Professor extends Person{

    public Professor(String name, int age, int id) {
        super(name, age, id);
    }

    public void giveQuiz(String a) {
        System.out.println("I gave a quiz!");
    }
}
