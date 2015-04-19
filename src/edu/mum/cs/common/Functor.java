package edu.mum.cs.common;

public interface Functor<T, R> {
	void execute(T t);

	R getValue();
}
