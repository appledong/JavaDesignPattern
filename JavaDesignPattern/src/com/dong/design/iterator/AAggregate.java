package com.dong.design.iterator;

public class AAggregate<T> extends Aggregate<T> {

	@Override
	public Iterator<T> createIterator() {
		return new AIterator<T>(this);
	}

}
