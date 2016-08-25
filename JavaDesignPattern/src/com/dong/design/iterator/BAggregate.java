package com.dong.design.iterator;

/**
 * 实体聚合类的扩展
 * @author dong
 *
 * @param <T>
 */
public class BAggregate<T> extends Aggregate<T> {

	@Override
	public Iterator<T> createIterator() {
		return new BIterator<T>(this);
	}

}
