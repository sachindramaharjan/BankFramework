package edu.mum.cs.data;

import java.util.List;

import edu.mum.cs.db.dao.IAccountDao;
import framework.interfaces.account.Account;
import framework.service.IAccountService;

public class AccountService implements IAccountService {
	IAccountDao dao;

	public AccountService(IAccountDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(Account t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub

	}

}
