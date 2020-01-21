package com.cts.oopd.Collection.ui;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person() {
		name="";
		age=0;
	}
	public Person(String name) {
		this.name=name;
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return false;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Person other=(Person)obj;
		if(age!=other.age)
			return false;
		if(name==null) {
			if(other.name!=null)
				return false;
		}else if(!name.contentEquals(other.name))
			return false;
		return true;
	}

@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
@Override
public int compareTo(Person other) {
	if(this.name.equals(other.name))
		return this.age-other.age;
	else
		return this.name.compareTo(other.name);
}
}

