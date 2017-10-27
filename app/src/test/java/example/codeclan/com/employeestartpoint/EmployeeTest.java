package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;

    @Before
    public void before() {
        employee = new Employee(1, "Sandra", "AB123456C", 30000.00);
    }


    @Test
    public void canSetEmployeeId() {
        employee.setId(1);
        assertEquals(1, employee.getId());
    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canSetEmployeeSsn() {
        employee.setSSN("AB123456C");
        assertEquals("AB123456C", employee.getSocialSecurityNumber());
    }

    @Test
    public void canSetEmployeeSalary() {
        employee.setSalary(30000.00);
        assertEquals(30000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseEmployeeSalary() {
        employee.setSalary(30000.00);
        employee.raiseSalary(3000.00);
        assertEquals(33000.00, employee.getSalary(), 0.01);
    }
}
