public class Main {
    public static void main(String[] args) {
        Department software = new Department("software", 1);

        Employee sample = new Employee();
        Employee Jack = new Employee(sample);
        Jack.setName("Jack");
        Jack.setId(007);

        Employee Mark = new Employee(sample);
        Mark.setName("Mark");
        Mark.setId(006);

        Jack.printEmployeeInfo();
        Mark.printEmployeeInfo();
    }
}
