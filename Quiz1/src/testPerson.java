public class testPerson {
    public static void main(String[] args) {
        Professor professor = new Professor("jack", 30, 123);
        Student student = new Student("sam", 20, 31);
        professor.giveQuiz("test1");
        student.takeQuiz("test1");
    }
}
