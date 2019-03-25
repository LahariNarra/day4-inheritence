package com.capgemini.bank.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bank.model.CurrentBankAccount;

public class CurrentBankAccountTest {
	CurrentBankAccount currentAccount;

	@Before
	public void setUp() {
		currentAccount = new CurrentBankAccount(101, "Lahari", 24000, 20000);
	}

	@Test
	public void tesCurrentBankAccountIsCreatedWithDefaultConstructor() {
		CurrentBankAccount currentAccount = new CurrentBankAccount();
		assertNotNull(currentAccount);
	}

	@Test
	public void tesCurrentBankAccountIsCreatedWithParametrizedConstructor() {
		assertEquals(101, currentAccount.getAccountId());
		assertEquals("Lahari", currentAccount.getAccountHolderName());
		assertEquals(24000.0, currentAccount.getAccountBalance(), 0.01);
		assertEquals(20000, currentAccount.getDebitLimit(), 0.01);

	}
	@Test
	public void testWithdrawAmountWithCurrentBalance()  {
		currentAccount.withdraw(24000);
		assertEquals(0, currentAccount.getAccountBalance(),0.01);
	}
	@Test
	public void testWithdrawAmountWithoutExtendingDebitLimt()  {
		currentAccount.withdraw(34000);
		assertEquals(0, currentAccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdrawAmountWithExtendingDebitLimt()  {
		currentAccount.withdraw(55000);
		
	}
	@Test
	public void testDepositAmountWithBorrowedAmountGreaterThanZero()  {
		currentAccount.withdraw(20000);
		currentAccount.deposit(25000);
		assertEquals(29000, currentAccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testDepositAmountWithBorrowedAmountEqualToZero()  {
		currentAccount.withdraw(24000);
		currentAccount.deposit(25000);
		assertEquals(25000, currentAccount.getAccountBalance(),0.01);
	}
	@Test
	public void testDepositAmountWithBorrowedAmountLessThanZero()  {
		currentAccount.withdraw(34000);
		currentAccount.deposit(25000);
		assertEquals(15000, currentAccount.getAccountBalance(),0.01);
	}

}
