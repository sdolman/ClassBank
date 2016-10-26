package org.wecancodeit.exercise.inclass.cbus2016.banking;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountFactory {

	public Account read(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		//Construct BufferedReader from InputStreamReader
		BufferedReader buffer = new BufferedReader(new InputStreamReader(fis));
		// BufferedReader buffer = new BufferedReader(new FileReader(filePath));
		String name = buffer.readLine();
		String idNumber;
		int balance;
		String accountType;
		buffer.close();
		Account account = new Account(name);
		return account;
	}

}
