package rec2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeEach
	void resetCount() {
		Employee.empCount = 0;
	}
	
	@Test
	void testEquality() {
		Employee e1 = new Employee (111, "John", 35);
		Employee e2 = new Employee (111, "John", 35);
		assertFalse(e1==e2);
		
		e1 = new Employee (111, "John", 35);
		e2 = new Employee (111, "John", 45);
		assertTrue(e1.equals(e2));
		
		e1 = new Employee (111, "John", 35);
		e2 = new Employee (222, "John", 35);
		assertFalse(e1.equals(e2));
	}
	
	@Test
	void testBirthday() {
		Employee john = new Employee (111, "John", 35);
		// year passed
		Employee.birthday(john);
		
		// another year passed
		Employee.birthday(john);
		assertEquals(37, john.getAge());
	}
	
	@Test
	void testEmpCount() {		
		Employee e1 = new Employee (111, "John", 35);
		Employee e2 = new Employee (222, "Mary", 30);
		Employee e3 = new Employee (333, "Alice", 45);
		
		//how many total employees created?		
		assertEquals(3, Employee.empCount);
	}
	
	@Test
	void testSetAge() {		
		Employee e1 = new Employee (111, "John", 35);
		//INVALID: the age cannot decrease
		e1.setAge(30);		
		
		// so it should not have changed
		assertEquals(35, e1.getAge());
		
		//INVALID: the age cannot be <= 0
		e1.setAge(0);
		assertEquals(35, e1.getAge());
		
		e1.setAge(50);
		assertEquals(50, e1.getAge());
	}

	@Test
	void testSwap() {		
		Employee best = new Employee (111, "John", 35);
		Employee secondBest = new Employee (222, "Alice", 35);		
		
		// they should not have changed: 
		// swapping references inside the swap() was only applied to copies		
		System.out.println("\nOUTSIDE: Before CALLING swap: best = "+ best + " second best = " + secondBest);
		Employee.swap(best, secondBest);		
		System.out.println("\nOUTSIDE: After CALLING swap: best = "+ best + " second best = " + secondBest);			
		
		assertEquals("John", secondBest.getName());
		assertEquals("Alice", best.getName());
	}
}
