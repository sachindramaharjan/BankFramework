package edu.mum.cs.db.dao;

import java.util.List;

import edu.mum.cs.bean.BankAccount;
import edu.mum.cs.common.Functor;
import edu.mum.cs.common.Predicate;
import edu.mum.cs.data.DataSource;
import framework.interfaces.account.Account;

public class MemAccountDao implements IAccountDao {

	@Override
	public void insert(Account t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Account t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAll() {

		return DataSource.getAccounts();
	}

	@Override
	public <R> void doAll(Functor<Account, R> func, Predicate<Account> p) {
		// TODO Auto-generated method stub

	}
}
