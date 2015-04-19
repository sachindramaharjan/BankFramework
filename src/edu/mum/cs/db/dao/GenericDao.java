package edu.mum.cs.db.dao;

import java.util.List;

import edu.mum.cs.common.Functor;
import edu.mum.cs.common.Predicate;

public interface GenericDao<T> {
	void insert(T t);

	void update(T t);

	void delete(Integer id);

	T getById(Integer id);

	List<T> getAll();

	<R> void doAll(Functor<T, R> func, Predicate<T> p);
}
