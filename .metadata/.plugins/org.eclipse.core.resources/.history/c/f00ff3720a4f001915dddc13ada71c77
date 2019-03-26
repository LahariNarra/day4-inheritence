package com.capgemini.training.model;

public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining() {
		super();

	}

	public CorporateTraining(int id, String name, double fees, int days) {
		super(id, name, fees);
		this.days = days;

	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	public double getOrderValue() {
		return getFees()*days;
	}
}
