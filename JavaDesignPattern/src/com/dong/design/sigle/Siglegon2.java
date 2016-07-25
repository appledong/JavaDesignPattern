package com.dong.design.sigle;

public enum Siglegon2 {
	Instanse;

	public Person person = new Person();

	public Person modifyPersonName(Person person) {
		person.name = "ssss";
		return person;
	}

}
