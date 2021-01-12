package staff.techStaff;

import staff.Employee;

public class Developer extends Employee {

    private String deptName;

    public Developer(String name, String nationalInsuranceNumber, double salary, String deptName) {
        super(name, nationalInsuranceNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}