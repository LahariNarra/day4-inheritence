package com.capgemini.bank.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bank.model.SavingsBankAccount;


public class SavingsBankAccountTest {
	SavingsBankAccount savingsAccount;

	@Before
	public void setUp() {
		savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,true);
	}

	@Test
	public void testSavingBankAccountIsCreatedWithDefaultConstructor() {
		SavingsBankAccount savingsAccount = new SavingsBankAccount();
		assertNotNull(savingsAccount);
	}
	@Test
	public void testSavingBankAccountIsCreatedWithParametrizedConstructor() {
		assertEquals(101, savingsAccount.getAccountId());
		assertEquals("Lahari", savingsAccount.getAccountHolderName());
		assertEquals(24000.0, savingsAccount.getAccountBalance(), 0.01);
		assertTrue(savingsAccount.isSalaryAccount());
		
	}
	
	@Test
	public void testSavingBankAccountIsCreatedWithParametrizedConstructorSavedAccountFalse() {
		SavingsBankAccount savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,false);
		assertEquals(101, savingsAccount.getAccountId());
		assertEquals("Lahari", savingsAccount.getAccountHolderName());
		assertEquals(24000.0, savingsAccount.getAccountBalance(), 0.01);
		assertFalse(savingsAccount.isSalaryAccount());
		
	}
	@Test
	public void testWithdrawSalaryAccountWithSufficientFund()  {
		savingsAccount.withdraw(23000);
		assertEquals(1000, savingsAccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawSalaryAccountWithInSufficientFund()  {
		savingsAccount.withdraw(25000);
		
	}
	@Test
	public void testWithdrawWithoutSalaryAccountWithSufficientFund()  {
		SavingsBankAccount savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,false);
		savingsAccount.withdraw(5000);
		assertEquals(19000, savingsAccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawWithoutSalaryAccountWithInSufficientFund()  {
		SavingsBankAccount savingsAccount = new SavingsBankAccount(101, "Lahari" ,24000,false);
		savingsAccount.withdraw(20000);
		
	}

}
