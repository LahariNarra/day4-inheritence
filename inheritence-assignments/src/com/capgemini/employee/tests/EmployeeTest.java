package com.capgemini.employee.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Employee;

public class EmployeeTest {
		private Employee employee;
		
	@Before
	public void setUp() {
		employee = new Employee(1202,"Narra",30000,2000);
	}

	@Test
	public void testToCheckObjectIsCreatedWithDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}
	
	@Test
	public void testToCheckIsCreatedParametrizedConstructor() {
		Employee employee = new Employee(1201,"Lahari",20000,1500);
		assertEquals(1201,employee.getEmployeeId());
		assertEquals("Lahari",employee.getEmployeeName());
		assertEquals(20000.0,employee.getEmployeeBasicSalary(),0.01);
		assertEquals(1500.0, employee.getEmployeeMedical(),0.01);
		
	}
	
	@Test
	public void testToCheckGrossSalary() {
		assertEquals(47000.0,employee.getEmployeeGrossSalary(),0.01);
	}
	
	@Test
	public void testToCheckNetSalary() {
		assertEquals(43200.0, employee.getemployeeNetSalary(),0.01);
	}
	
}
