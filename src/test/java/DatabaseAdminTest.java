import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Kat", "KM34567", 22000.00, "Tech Staff");
    }

    @Test
    public void hasName() {
        assertEquals("Kat", databaseAdmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("KM34567", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(22000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(23000.50, databaseAdmin.raiseSalary(1000.50), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(220, databaseAdmin.payBonus(22000), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Tech Staff", databaseAdmin.getDeptName());
    }
}