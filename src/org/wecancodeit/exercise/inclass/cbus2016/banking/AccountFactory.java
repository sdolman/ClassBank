package org.wecancodeit.exercise.inclass.cbus2016.banking;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountFactory {

	public Account read(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		// Construct BufferedReader from InputStreamReader
		BufferedReader buffer = new BufferedReader(new InputStreamReader(fis));
		// BufferedReader buffer = new BufferedReader(new FileReader(filePath));
		String name = buffer.readLine();
		String idNumber = buffer.readLine();
		int balance = Integer.parseInt(buffer.readLine());
		String accountType = buffer.readLine();
		buffer.close();
		Account account;
		if (accountType.equalsIgnoreCase("Checking")) {
			account = createCheckingAccount(name, idNumber, balance);
		}
		else if (accountType.equalsIgnoreCase("Savings")) {
			account = createSavingsAccount(name, idNumber, balance);
		}
		else {
			throw new UnsupportedOperationException();
		}
		return account;
	}

	private Account createSavingsAccount(String name, String idNumber,
			int balance) {
		return new SavingsAccount(name, idNumber, balance);
	}

	private Account createCheckingAccount(String name, String idNumber,
			int balance) {
		return new CheckingAccount(name, idNumber, balance);
	}

}
