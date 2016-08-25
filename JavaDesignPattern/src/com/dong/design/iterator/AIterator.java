package com.dong.design.iterator;

public class AIterator<T> implements Iterator<T> {

	private Aggregate<T> aggregate;

	private int cursorNext;
	private int cursorPrevious;

	public AIterator(Aggregate<T> aggregate) {
		this.aggregate = aggregate;
		cursorNext = 0;
		cursorPrevious = aggregate.list.size() - 1;
	}

	@Override
	public void next() {
		if (!isLast()) {
			cursorNext++;
		} else {
			System.out.println("已到最后一个元素，不能够再next了");
		}
	}

	/**
	 * 由于遍历时size-1也得取出且正向游标的范围是0到size-1，所以和size对比
	 */
	@Override
	public boolean isLast() {
		return cursorNext == aggregate.list.size();
	}

	@Override
	public void previous() {
		if (!isFirst()) {
			cursorPrevious--;
		} else {
			System.out.println("已到第一个元素，不能够再previous了");
		}
	}

	/**
	 * 由于遍历时0也得取出且反向游标的范围是size-1到0，所以和-1对比
	 */
	@Override
	public boolean isFirst() {
		return cursorPrevious == -1;
	}

	@Override
	public T getNextItem() {
		return aggregate.list.get(cursorNext);
	}

	@Override
	public T getPreviousItem() {
		return aggregate.list.get(cursorPrevious);
	}

}
