package edu.mum.cs.db.dao.factory;

import edu.mum.cs.db.dao.CompanyDao;
import edu.mum.cs.db.dao.IAccountDao;
import edu.mum.cs.db.dao.PersonDao;

public class MySqlDaoFactory implements AbstractDaoFactory {


	@Override
	public IAccountDao getAccountDao() {
		return null;
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
