

public class PassingValueInThreadClass implements Runnable{

    public Employee employee;

    public PassingValueInThreadClass(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Thread: " + Thread.currentThread().getName());
            System.out.println("Employee name: " + employee.getName());
            System.out.println("Employee age： " + employee.getAge());
        }

    }



}
