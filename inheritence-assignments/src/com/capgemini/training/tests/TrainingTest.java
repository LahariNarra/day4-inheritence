package com.capgemini.training.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.training.model.Training;

public class TrainingTest {

	@Test
	public void testToCheckObjectIsCreatedWithDefaultConstructor() {
		Training training = new Training();
		assertNotNull(training);
	}
	
	@Test
	public void testToCheckObjectIsCreatedWithParametrizedConstructor() {
		Training training = new Training(1748,"Java",5000);
		assertEquals(1748, training.getId());
		assertEquals("Java", training.getName());
		assertEquals(5000, training.getFees(),0.01);
		
	}
}
