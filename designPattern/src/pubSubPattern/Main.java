package pubSubPattern;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Student 1", 1, 25);
        Student st2 = new Student("Student 2", 2, 24);
        Student st3 = new Student("Student 3", 3, 27);
        Student st4 = new Student("Student 4", 4, 25);
        Student st5 = new Student("Student 5", 5, 21);
        Professor prof1 = new Professor("Professor 1", 1, 48);
        Professor prof2 = new Professor("Professor 2", 1, 48);
        st1.subscribe(prof1);
        st2.subscribe(prof1);
        st3.subscribe(prof2);
        st4.subscribe(prof2);
        st5.subscribe(prof2);

        prof1.giveQuiz("Quiz1");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        prof2.giveQuiz("Quiz2");
    }
}