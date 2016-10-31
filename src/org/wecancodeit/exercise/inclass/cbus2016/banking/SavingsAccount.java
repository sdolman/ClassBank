package org.wecancodeit.exercise.inclass.cbus2016.banking;

public class SavingsAccount extends DebitAccount {

	public static int minimumBalance = 300;
	
	public SavingsAccount(String name, String idNumber, int balance) {
		super(name, idNumber, balance);
	}
	
	@Override
	public void withdrawFunds(int transaction) {
		if (balance - minimumBalance >= transaction) {
			balance -= transaction;
		}
		else {
			balance = minimumBalance;
		}
	}

}
