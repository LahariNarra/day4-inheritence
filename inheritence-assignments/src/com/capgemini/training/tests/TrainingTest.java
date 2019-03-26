package com.capgemini.training.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.training.model.CorporateTraining;
import com.capgemini.training.model.PublicTraining;
import com.capgemini.training.model.Training;

public class TrainingTest {

	@Test
	public void testToCheckOrderValueForPublic() {
		Training  publicTraining = new PublicTraining(1748,"Java",5000,50);
		assertEquals(250000, publicTraining.getOrderValue(),0.01);
	}
	@Test
	public void testToCheckOrderValueForCoorporate() {
		Training corporateTraining = new CorporateTraining(1748,"Big Data",35000,4);
		assertEquals(140000, corporateTraining.getOrderValue(),0.01);
	}
}
