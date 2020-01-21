package com.cts.oopd.ui;
import com.cts.oopd.Collection.ui.Person;
import java.util.Set;
import java.util.TreeSet;
public class APP06 {

	public static void main(String [] args) {
		Set<Person> persons=new TreeSet<>();
		persons.add(new Person("bala",23));
		persons.add(new Person("bal",20));
		persons.add(new Person("baaa",21));
		for(Person person:persons) {
			System.out.println(person);
		}
		System.out.println("....................");
	}
}
