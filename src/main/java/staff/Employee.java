package staff;

public abstract class Employee {

    String name;
    String nationalInsuranceNumber;
    double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raiseAmount) {
        return salary += raiseAmount;
    }

    public double payBonus(double salary) {
        return salary * 0.01;
    }
}
