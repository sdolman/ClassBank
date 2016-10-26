package org.wecancodeit.exercise.inclass.cbus2016.banking;

public class DebitAccount extends Account {

	public DebitAccount() {
		super(name);
	}

	public void depositFunds(int transaction) {
		// same as balance = balance + transaction
		balance += transaction;
	}

	public void withdrawFunds(int transaction) {
		balance -= transaction;
	}

}