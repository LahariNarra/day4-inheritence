package com.capgemini.employee.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Manager;

public class ManagerTest {
	Manager manager;
	
	@Before
		public void setUp() {
			manager = new Manager(122,"Mukhesh",30000,2000);

	}

	@Test
	public void testToCheckObjectIsCreatedByDefaultConstructor() {
		Manager manager = new Manager();
		assertNotNull(manager);
	}
	@Test
	public void testToCheckIsCreatedParametrizedConstructor() {
		Manager manager = new Manager(1201,"Lahari",20000,1500);
		assertEquals(1201,manager.getEmployeeId());
		assertEquals("Lahari",manager.getEmployeeName());
		assertEquals(20000.0,manager.getEmployeeBasicSalary(),0.01);
		assertEquals(1500.0, manager.getEmployeeMedical(),0.01);
	}
	
	@Test
	public void testToCheckGrossSalary() {
		assertEquals(54200.0,manager.getEmployeeGrossSalary(),0.01);
	}
	@Test
	public void testToCheckNetSalary() {
		assertEquals(50400.0,manager.getemployeeNetSalary(),0.01);
	}

}
