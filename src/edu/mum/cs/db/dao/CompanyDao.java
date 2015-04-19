package edu.mum.cs.db.dao;

import java.util.List;

import edu.mum.cs.bean.BankAccount;
import edu.mum.cs.common.Functor;
import edu.mum.cs.common.Predicate;

public class CompanyDao implements GenericDao<BankAccount> {

	@Override
	public void insert(BankAccount t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(BankAccount t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public BankAccount getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankAccount> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> void doAll(Functor<BankAccount, R> func, Predicate<BankAccount> p) {
		// TODO Auto-generated method stub

	}

}
