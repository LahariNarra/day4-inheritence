package com.capgemini.employee.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeBasicSalary;
	private double employeeHRA;
	private double employeeMedical;
	private double employeePF;
	private double employeePT;
	private double employeeNetSalary;
	private double employeeGrossSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double employeeBasicSalary, double employeeMedical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeBasicSalary = employeeBasicSalary;
		this.employeeMedical = employeeMedical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeBasicSalary() {
		return employeeBasicSalary;
	}

	public void setEmployeeBasicSalary(double employeeBasicSalary) {
		this.employeeBasicSalary = employeeBasicSalary;
	}

	public double getEmployeeMedical() {
		return employeeMedical;
	}

	public void setEmployeeMedical(double employeeMedical) {
		this.employeeMedical = employeeMedical;
	}

	public double getEmployeeGrossSalary() {

		employeeHRA = (50 * employeeBasicSalary) / 100;
		employeeGrossSalary = employeeBasicSalary + employeeHRA + employeeMedical;
		return employeeGrossSalary;
	}

	public double getemployeeNetSalary() {
		employeePF = (12 * employeeBasicSalary)/100;
		employeePT = 200;
		employeeNetSalary = getEmployeeGrossSalary()-(employeePF+employeePT);
		return employeeNetSalary;
	}

}
