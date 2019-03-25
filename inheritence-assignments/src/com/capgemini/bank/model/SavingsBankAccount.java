package com.capgemini.bank.model;

public class SavingsBankAccount extends BankAccount {

	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE = 5000;
	
	
	public SavingsBankAccount() {
		super();
	}

	public SavingsBankAccount(long accountId, String accountHolderName,  double accountBalance,boolean salaryAccount) {
		super(accountId, accountHolderName, "Savings", accountBalance);
		this.salaryAccount = salaryAccount;
		
	}

	public boolean isSalaryAccount(boolean salaryAccount) {
		return true;
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	@Override
	public double withdraw(double amount)  {
		if(salaryAccount) {
			return super.withdraw(amount);
		}
		else {
			if(getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount); 
			else
				System.out.println("You dont have sufficient balance");
			return getAccountBalance();
		}
	}

	
}
