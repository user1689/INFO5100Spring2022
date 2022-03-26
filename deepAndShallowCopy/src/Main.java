public class Main {
    public static void main(String[] args) {
        // Department software = new Department("software", 1);

        Professor sample = new Professor();
        Professor Jack = new Professor(sample);
        Jack.setName("Jack");
        Jack.setUid(007);

        Professor Mark = new Professor(sample);
        Mark.setName("Mark");
        Mark.setUid(006);

        Jack.printEmployeeInfo();
        Mark.printEmployeeInfo();
    }
}
