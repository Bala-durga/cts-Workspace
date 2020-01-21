package com.cts.oopd.ui;

import java.util.Set;
import java.util.TreeSet;

import com.cts.oopd.model.Person;

public class SetDemo {

	public static void main(String[] args) {
		//Set<Person> p=new HashSet<>();
		//Set<Person> p=new LinkedHashSet<>();
		Set<Person> p=new TreeSet<>();
		p.add(new Person("ram",25));
		p.add(new Person("bam",26));
		p.add(new Person("aam",27));
		p.add(new Person("rdam",25));
		
		for(Person var:p) {
			System.out.println(var);
		}
		

	}

}

