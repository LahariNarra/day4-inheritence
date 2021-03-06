package com.capgemini.employee.model;

public class Manager extends Employee {
	private double employeePetrolAllowance;
	private double employeeFoodAllowance;
	private double employeeOtherAllowance;
	private double managerGrossSalary;
	private double managerNetSalary;

	public Manager() {
		super();
	}

	public Manager(int employeeId, String employeeName, double employeeBasicSalary, double employeeMedical) {
		super(employeeId, employeeName, employeeBasicSalary, employeeMedical);

	}

	@Override
	public double getEmployeeGrossSalary() {
		employeeFoodAllowance = (13 * getEmployeeBasicSalary()) / 100;
		employeePetrolAllowance = (8 * getEmployeeBasicSalary()) / 100;
		employeeOtherAllowance = (3 * getEmployeeBasicSalary()) / 100;
		managerGrossSalary = super.getEmployeeGrossSalary() + employeeFoodAllowance + employeeOtherAllowance
				+ employeePetrolAllowance;
		return managerGrossSalary;
	}

	public double getemployeeNetSalary() {
		double employeePF = (12 * getEmployeeBasicSalary()) / 100;
		double employeePT = 200;
		managerNetSalary = getEmployeeGrossSalary() - (employeePF + employeePT);
		return managerNetSalary;

	}

}
