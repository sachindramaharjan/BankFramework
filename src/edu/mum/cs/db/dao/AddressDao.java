package edu.mum.cs.db.dao;

import java.util.List;

import edu.mum.cs.bean.Address;
import edu.mum.cs.common.Functor;
import edu.mum.cs.common.Predicate;

public class AddressDao implements GenericDao<Address> {

	@Override
	public void insert(Address t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Address t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Address getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> void doAll(Functor<Address, R> func, Predicate<Address> p) {
		// TODO Auto-generated method stub

	}

}
