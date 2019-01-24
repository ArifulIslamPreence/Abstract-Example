package Employee.EmployeeEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void test() {
		Employee emp = new Employee(121,"Preence",2000);
		
		assertEquals(2000,emp.salary());
	}

}
