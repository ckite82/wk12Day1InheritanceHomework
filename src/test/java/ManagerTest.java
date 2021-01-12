import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Chris", "CK12345", 25000.00, "Management");
    }

    @Test
    public void hasName() {
        assertEquals("Chris", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("CK12345", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(26000.50, manager.raiseSalary(1000.50), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, manager.payBonus(25000), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Management", manager.getDeptName());
    }
}
