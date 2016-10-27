package org.wecancodeit.exercise.inclass.cbus2016.banking;

public class Account {

	private String name; // Use getName() in other classes
	private String idNumber;
	protected int balance;

	public Account(String newName, String newIdNumber, int newBalance) {
		name = newName;
		idNumber = newIdNumber;
		balance = newBalance;
	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getIdNumber() {
		// TODO Auto-generated method stub
		return idNumber;
	}

}