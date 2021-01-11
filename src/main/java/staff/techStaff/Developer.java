package staff.techStaff;

import staff.Employee;

public class Developer extends Employee {

    private String deptName;

    public Developer(String deptName) {
        super("Davie", "DS56789", 20000);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}