package staff.techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee{

    private String deptName;

    public DatabaseAdmin(String deptName){
        super("Kat", "KM34567", 22000);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}