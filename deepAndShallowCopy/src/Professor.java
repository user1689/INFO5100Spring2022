public class Professor {

    private int uid;
    private String name;
    private Department dept;

    // default method
    public Professor() {
        this.uid = 0;
        this.name = "default";
        this.dept = null;
    }

    public Professor(Professor professor) {
        this.name = professor.getName();
        this.uid = professor.getUid();
        this.dept = new Department("default department", 1);
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void printEmployeeInfo() {
        System.out.println("name: " + this.getName());
        System.out.println("uid: " + this.getUid());
        System.out.println("dept: " + this.getDept());
    }
}