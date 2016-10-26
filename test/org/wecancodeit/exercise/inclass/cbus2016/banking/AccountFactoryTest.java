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
	public void shouldReadID() {
		
	}
	
	@Test
	public void shouldReadBalance() {
		
	}
	
	@Test
	public void shouldBeChecking() {
		
	}

}
