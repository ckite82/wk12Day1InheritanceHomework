import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;
    Employee employee;

    @Before
    public void before(){
        director = new Director(1000000.00);
        employee = new Employee("Andrew", "AK1010101", 100000);
    }

    @Test
    public void hasName(){
        assertEquals("Jeff", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("CK12345", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(26000, director.raiseSalary(1000.50), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, director.payBonus(25000), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }
}