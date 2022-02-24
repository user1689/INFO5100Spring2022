package pubSubPattern;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person{

    List<Student> students;
    String quiz;

    public Professor(String name, int id, int age) {
        super(name, id, age);
        students = new ArrayList<>();
    }

    public void giveQuiz(String quiz) {
        for (Student s : students) {
            s.takeQuiz(this);
            this.quiz = quiz;
        }
    }

}
