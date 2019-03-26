package com.capgemini.training.model;

public abstract class Training {
	private int id;
	private String name;
	private double fees;

	public Training() {
		super();
	}

	public Training(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	public abstract double getOrderValue();

	@Override
	public String toString() {
		return "Training [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	

}
