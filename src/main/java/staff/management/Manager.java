package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName){
        super("Chris", "CK12345", 25000);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
