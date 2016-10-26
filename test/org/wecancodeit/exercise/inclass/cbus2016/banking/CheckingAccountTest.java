package org.wecancodeit.exercise.inclass.cbus2016.banking;

import org.junit.Assert;

import org.junit.Test;

public class CheckingAccountTest {

	@Test
	public void shouldBeZeroBalance() {
		DebitAccount underTest = new CheckingAccount();
		int balance = underTest.getBalance();
		Assert.assertEquals(0, balance);
	}

	@Test
	public void shouldBe1BalanceAfterDeposit() {
		// arrange
		DebitAccount underTest = new CheckingAccount();

		// act
		underTest.depositFunds(1);

		// assert
		int balance = underTest.getBalance();
		Assert.assertEquals(1, balance);
	}

	@Test
	public void shouldBe2BalanceAfter2DepositsOf1Each() {
		// arrange
		DebitAccount underTest = new CheckingAccount();

		// act
		underTest.depositFunds(1);
		underTest.depositFunds(1);
		// assert
		int balance = underTest.getBalance();
		Assert.assertEquals(2, balance);
	}

	@Test
	public void shouldBeAbleToWithdraw() {
		// arrange
		DebitAccount underTest = new CheckingAccount();
		//act
		underTest.depositFunds(2);
		underTest.withdrawFunds(1);
		//assert
		int balance = underTest.getBalance();
		Assert.assertEquals(1, balance);
	}
	
	@Test
	public void shouldBeAbleToWithdraw3From5() {
		// arrange
		DebitAccount underTest = new CheckingAccount();
		//act
		underTest.depositFunds(5);
		underTest.withdrawFunds(3);
		//assert
		int balance = underTest.getBalance();
		Assert.assertEquals(2, balance);
	}
}
