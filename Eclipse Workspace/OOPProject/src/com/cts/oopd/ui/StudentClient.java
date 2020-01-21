package com.cts.oopd.ui;
import com.cts.oopd.model.Student;
public class StudentClient {

	public static void main(String[] args) {
		Student.setFeePaid(75000);
		Student.setCourse("java FSD");
		Student [] students=new Student[3];
		students [0]=new Student(1,"bala");
		students [1]=new Student(2,"durga");
		students [2]=new Student(3,"bal");
		for(Student student:students) {
			student.show();
		}
	}
}
