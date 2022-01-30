public class Employee {

    private String name;
    private int employeeId;
    private String SSN;
    private int level;

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getSSN() {
        return SSN;
    }

    public int getLevel() {
        return level;
    }

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        this.SSN = SSN;
        this.level = level;
    }

    public Employee() {
        this.name = "";
        this.employeeId = 0;
        this.SSN = null;
        this.level = 0;
    }
}
