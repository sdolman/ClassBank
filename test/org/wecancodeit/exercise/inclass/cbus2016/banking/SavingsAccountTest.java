package org.wecancodeit.exercise.inclass.cbus2016.banking;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void shouldHaveBeMinimumBalance() {
		Account underTest = new SavingsAccount(null, null, SavingsAccount.minimumBalance);
		int balance = underTest.getBalance();
		Assert.assertEquals(300, balance);
	}
	
	@Test
	public void shouldHaveBalanceof400AfterDepositOf100() {
		SavingsAccount underTest = new SavingsAccount(null, null, SavingsAccount.minimumBalance);
		underTest.depositFunds(100);
		int balance = underTest.getBalance();
		Assert.assertEquals(400, balance);
	}
	
	
	@Test
	public void shouldHave1000AfterWithdrawing100From1100() {
		SavingsAccount underTest = new SavingsAccount(null, null, SavingsAccount.minimumBalance);
		underTest.depositFunds(800);
		underTest.withdrawFunds(100);
		int balance = underTest.getBalance();
		Assert.assertEquals(1000, balance);
	}
	
	@Test
	public void shouldHaveMinimumBalanceAfterLargeWithdrawal() {
		SavingsAccount underTest = new SavingsAccount(null, null, SavingsAccount.minimumBalance);
		underTest.depositFunds(800);
		underTest.withdrawFunds(10000);
		int balance = underTest.getBalance();
		Assert.assertEquals(300, balance);
	}

}
