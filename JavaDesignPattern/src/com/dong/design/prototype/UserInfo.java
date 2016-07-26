package com.dong.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class UserInfo implements Cloneable {

	private User user;
	private Integer sex;
	private List<String> books = new ArrayList<>();

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(String book) {
		this.books.add(book);
	}

	@Override
	public String toString() {
		for (String string : books) {
			System.out.println("Book:" + string);
		}
		return "UserInfo [user=" + user + ", sex=" + sex + ", books=" + books
				+ "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
