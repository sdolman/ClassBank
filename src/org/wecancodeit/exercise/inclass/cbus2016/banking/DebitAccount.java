package org.wecancodeit.exercise.inclass.cbus2016.banking;

public class DebitAccount extends Account {

	public DebitAccount(String name, String idNumber, int balance) {
		super(name,idNumber,balance);
	}

	public void depositFunds(int transaction) {
		// same as balance = balance + transaction
		balance += transaction;
	}

	public void withdrawFunds(int transaction) {
		if (balance >= transaction) {
			balance -= transaction;
		}
		else {
			balance = 0;
		}
	}

}