package edu.mum.cs.data;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs.bean.CheckingAccount;
import framework.interfaces.account.Account;

public class DataSource {
	public static List<Account> accounts = new ArrayList<Account>();
	static {
		Account a = new CheckingAccount();

	}

	public static List<Account> getAccounts() {
		return accounts;
	}
}
