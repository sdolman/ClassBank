package org.wecancodeit.exercise.inclass.cbus2016.banking;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void shouldHaveBeZeroBalance() {
		Account underTest = new SavingsAccount();
		int balance = underTest.getBalance();
		Assert.assertEquals(0, balance);
	}
}
