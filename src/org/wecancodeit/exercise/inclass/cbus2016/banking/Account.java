package org.wecancodeit.exercise.inclass.cbus2016.banking;

public class Account {

	private String name;

	public Account(String newName) {
		name = newName;
	}

	protected int balance;

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

}