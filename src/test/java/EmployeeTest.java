//import org.junit.Before;
//import org.junit.Test;
//import staff.Employee;
//
//import static org.junit.Assert.assertEquals;
//
//public class EmployeeTest {
//
//    Employee employee;
//
//    @Before
//    public void before(){
//        employee = new Employee("Chris", "CK12345", 25000);
//    }
//
//    @Test
//    public void employeeHasName(){
//        assertEquals("Chris", employee.getName());
//    }
//
//    @Test
//    public void employeeHasNI(){
//        assertEquals("CK12345", employee.getNationalInsuranceNumber());
//    }
//
//    @Test
//    public void employeeHasSalary(){
//        assertEquals(25000, employee.getSalary());
//    }
//
//    @Test
//    public void canRaiseSalary(){
//        assertEquals(26000.50, employee.raiseSalary(), 0.01);
//    }
//
//    @Test
//    public void canPayBonus(){
//        assertEquals(25250, employee.payBonus(), 0.01);
//    }
//}
