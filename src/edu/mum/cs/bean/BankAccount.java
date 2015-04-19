package edu.mum.cs.bean;

import framework.interfaces.account.IAccount;
import framework.interfaces.account.Customer;

public abstract class BankAccount implements IAccount {
	Customer cust;
	Integer accNr;

}
