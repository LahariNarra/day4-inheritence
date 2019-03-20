package com.capgemini.employee.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Manager;
import com.capgemini.employee.model.MarketingExecutive;

public class MarketingExecutiveTest {
	MarketingExecutive marketing;

	@Before
	public void setUp() {
		marketing = new MarketingExecutive(125, "Karthik", 30000, 2000,50);
	}

	@Test
	public void testToCheckObjectIsCreated() {
		MarketingExecutive marketing = new MarketingExecutive();
		assertNotNull(marketing);
	}
	@Test
	public void testToCheckIsCreatedParametrizedConstructor() {
		assertEquals(125,marketing.getEmployeeId());
		assertEquals("Karthik",marketing.getEmployeeName());
		assertEquals(30000.0,marketing.getEmployeeBasicSalary(),0.01);
		assertEquals(2000.0, marketing.getEmployeeMedical(),0.01);
		assertEquals(50.0, marketing.getEmployeeTravelledKilometers(),0.01);
	}

	@Test
	public void testToCheckGrossSalary() {
		assertEquals(48750.0, marketing.getEmployeeGrossSalary(), 0.01);
	}
	@Test
	public void testToCheckNetSalary() {
		assertEquals(44950.0,marketing.getemployeeNetSalary(),0.01);
	}


}
