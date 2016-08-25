package com.dong.design.iterator;

public class User {

	public static void main(String[] args) {
		AAggregate<Person> aAggregate = new AAggregate<Person>();

		aAggregate.addItem(new Person("王明", "01", 12));
		aAggregate.addItem(new Person("李华", "02", 12));
		aAggregate.addItem(new Person("老李", "03", 12));
		aAggregate.addItem(new Person("陶明", "04", 12));
		aAggregate.addItem(new Person("老孟", "05", 12));

		Iterator<Person> iterator = aAggregate.createIterator();

		System.out.println("正向遍历");
		while (!iterator.isLast()) {
			Person person = iterator.getNextItem();
			iterator.next();
			System.out.println("person.id:" + person.id + "person.name:"
					+ person.name + "person.age:" + person.age);
		}

		System.out.println("反向遍历");
		while (!iterator.isFirst()) {
			Person person = iterator.getPreviousItem();
			iterator.previous();
			System.out.println("person.id:" + person.id + "person.name:"
					+ person.name + "person.age:" + person.age);
		}
	}
}
