package com.capgemini.employee.model;

public class MarketingExecutive extends Employee {

	private double employeeTravelledKilometers;
	private double employeeTourAllowance;
	private double employeeTelephoneAllowance;
	private double executiveGrossSalary;
	private double executiveNetSalary;

	public MarketingExecutive() {
		super();

	}

	public MarketingExecutive(int employeeId, String employeeName, double employeeBasicSalary, double employeeMedical,double employeeTravelledKilometers) {
		super(employeeId, employeeName, employeeBasicSalary, employeeMedical);
		this.employeeTravelledKilometers = employeeTravelledKilometers;
	}

	public double getEmployeeTravelledKilometers() {
		return employeeTravelledKilometers;
	}

	public void setEmployeeTravelledKilometers(double employeeTravelledKilometers) {
		this.employeeTravelledKilometers = employeeTravelledKilometers;
	}

	@Override
	public double getEmployeeGrossSalary() {
		
		employeeTourAllowance = getEmployeeTravelledKilometers() * 5;
		employeeTelephoneAllowance = 1500;
		executiveGrossSalary = super.getEmployeeGrossSalary() + employeeTelephoneAllowance + employeeTourAllowance;
		return executiveGrossSalary;
	}

	public double getemployeeNetSalary() {
		double employeePF = (12 * getEmployeeBasicSalary()) / 100;
		double employeePT = 200;
		executiveNetSalary = getEmployeeGrossSalary() - (employeePF + employeePT);
		return executiveNetSalary;

	}

}
