package edu.mum.cs.db.dao.factory;

import edu.mum.cs.db.dao.CompanyDao;
import edu.mum.cs.db.dao.IAccountDao;
import edu.mum.cs.db.dao.PersonDao;

public interface AbstractDaoFactory {

	IAccountDao getAccountDao();

	PersonDao getPersonDao();

	CompanyDao getCompanyDao();
}
