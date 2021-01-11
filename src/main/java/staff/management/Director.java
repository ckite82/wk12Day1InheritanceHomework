package staff.management;

import staff.Employee;
import staff.management.Manager;

public class Director extends Manager{

    private double budget;

    public Director(double budget){
        super("Management");
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
