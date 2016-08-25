package com.dong.design.iterator;

public interface Iterator<T> {

	public void next();

	public boolean isLast();

	public void previous();

	public boolean isFirst();

	public T getNextItem();

	public T getPreviousItem();

}
