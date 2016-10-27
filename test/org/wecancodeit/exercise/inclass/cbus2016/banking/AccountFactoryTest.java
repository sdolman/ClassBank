package org.wecancodeit.exercise.inclass.cbus2016.banking;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

public class AccountFactoryTest {

	@Test
	public void shouldReadName() throws IOException {
		// Arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-in-class-banking\\AccountTest.txt";
		// Act
		Account account = underTest.read(filePath);
		String name = account.getName();
		// Assert
		Assert.assertEquals("Joe Fakerton", name);
	}

	@Test
	public void shouldReadID() throws IOException {
		// Arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-in-class-banking\\AccountTest.txt";
		// Act
		Account account = underTest.read(filePath);
		String idNumber = account.getIdNumber();
		// Assert
		Assert.assertEquals("9876543", idNumber);
	}

	@Test
	public void shouldReadBalance() throws IOException {
		// Arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-in-class-banking\\AccountTest.txt";
		// Act
		Account account = underTest.read(filePath);
		int balance = account.getBalance();
		// Assert
		Assert.assertEquals(1500, balance);
	}

	@Test
	public void shouldBeChecking() throws IOException {
		// Arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-in-class-banking\\AccountTest.txt";
		// Act
		Account account = underTest.read(filePath);
		String className = account.getClass().getSimpleName();
		// Assert
		Assert.assertEquals("CheckingAccount", className);
	}

	@Test
	public void shouldBeSavings() throws IOException {
		// Arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-in-class-banking\\AccountTestSavings.txt";
		// Act
		Account account = underTest.read(filePath);
		String className = account.getClass().getSimpleName();
		// Assert
		Assert.assertEquals("SavingsAccount", className);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void cannotMakeNonsenseAccount () throws IOException {
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\OneDrive\\Documents\\WeCanCodeIT\\Repo\\java-cbus-in-class-banking\\AccountTestNonsense.txt";
		underTest.read(filePath);
		
	}

}
