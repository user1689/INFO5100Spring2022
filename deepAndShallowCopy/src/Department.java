public class Department {

    private String deptName;
    private int deptID;

    public Department(String deptName, int deptID) {
        this.deptName = deptName;
        this.deptID = deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }
}
