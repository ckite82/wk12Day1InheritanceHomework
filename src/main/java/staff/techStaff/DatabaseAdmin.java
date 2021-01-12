package staff.techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee{

    private String deptName;

    public DatabaseAdmin(String name, String nationalInsuranceNumber, double salary, String deptName){
        super(name, nationalInsuranceNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}