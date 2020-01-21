package com.cts.oopd.ui;
import com.cts.oopd.model.Employee;
import com.cts.oopd.model.Person;
import com.cts.oopd.model.Student1;
import com.cts.oopd.model.Manager;
public class InheritanceClient {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("BALA");
		person.setAge(23);
	    System.out.println(person);
	    Employee employee=new Employee();
	    employee.setName("baalaa");
	    employee.setAge(20);
	    employee.setSalary(40000);
	    System.out.println(employee);
        Student1 student=new Student1();
        student.setName("bal");
        student.setAge(24);
        student.setFee(45000);
        System.out.println(student);
	    Manager manager=new Manager();
	    manager.setName("sam");
	    manager.setAge(30);
	    manager.setSalary(50000);
	    manager.setBonus(34000);
	    System.out.println(manager);
	}
}