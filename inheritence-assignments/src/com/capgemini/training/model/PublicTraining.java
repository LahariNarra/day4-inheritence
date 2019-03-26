package com.capgemini.training.model;

public class PublicTraining extends Training{
	private int participants;

	public PublicTraining() {
		super();
		
	}

	public PublicTraining(int id, String name, double fees,int participants) {
		super(id, name, fees);
		this.participants = participants;
		
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
	@Override
	public double getOrderValue() {
		return getFees()*participants;
	}
	

}
