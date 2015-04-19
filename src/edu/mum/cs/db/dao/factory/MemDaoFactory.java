package edu.mum.cs.db.dao.factory;

import edu.mum.cs.db.dao.CompanyDao;
import edu.mum.cs.db.dao.IAccountDao;
import edu.mum.cs.db.dao.MemAccountDao;
import edu.mum.cs.db.dao.PersonDao;

public class MemDaoFactory implements AbstractDaoFactory {

	@Override
	public IAccountDao getAccountDao() {
		return new MemAccountDao();
	}

	@Override
	public PersonDao getPersonDao() {
		return null;
	}

	@Override
	public CompanyDao getCompanyDao() {
		return null;
	}

}
