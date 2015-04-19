package edu.mum.cs.service;

import java.util.List;

public interface Service<T> {
	public void add(T t);

	public T find(Integer id);

	public List<T> getAll();

	public void printReport();

}
