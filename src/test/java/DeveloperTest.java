import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Davie", "DS56789", 20000.00, "Tech Staff");
    }

    @Test
    public void hasName() {
        assertEquals("Davie", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("DS56789", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(21000.50, developer.raiseSalary(1000.50), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, developer.payBonus(20000), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Tech Staff", developer.getDeptName());
    }
}



