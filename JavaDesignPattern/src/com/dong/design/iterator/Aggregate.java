package com.dong.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 * 
 * @author dong
 *
 */
public abstract class Aggregate<T> {

	protected List<T> list = new ArrayList<>();

	public void addItem(T t) {
		list.add(t);
	}

	public void removeItem(T t) {
		list.remove(t);
	}

	public T getItem(int i) {
		if (i < list.size()) {
			return list.get(i);
		}
		return null;
	}

	public int getCount() {
		return list.size();
	}

	public abstract Iterator<T> createIterator();

}
