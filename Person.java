package edu.neu.csye6200.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Person {
	private Integer Age;
	private String Name;

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		this.Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public Person(Integer age, String name) {
		super();
		this.Age = age;
		this.Name = name;
	}

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(20, "Suraj"));
		list.add(new Person(19, "Rashmi"));
		list.add(new Person(24, "Sandhya"));
		for (Person P : list) {
			System.out.println("Name [" + P.getName() + "]" + "and " + "Age [" + P.getAge() + "]");
		}
		Collections.sort(list, (Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println("List sorted via Name");
		for (Person P : list) {
			System.out.println("Name [" + P.getName() + "]" + "and " + "Age [" + P.getAge() + "]");
		}
		Collections.sort(list, (Person p1, Person p2) -> p1.getAge().compareTo(p2.getAge()));
		System.out.println("List sorted via Age");
		for (Person P : list) {
			System.out.println("Name [" + P.getName() + "]" + "and " + "Age [" + P.getAge() + "]");
		}

	}

}
