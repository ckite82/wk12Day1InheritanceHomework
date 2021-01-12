import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Andrew", "AZ98765", 100000.00, "Management", 10000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Andrew", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("AZ98765", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(101000.50, director.raiseSalary(1000.50), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.00, director.payBonus(100000.00), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000000.00, director.getBudget(), 0.01);
    }
}