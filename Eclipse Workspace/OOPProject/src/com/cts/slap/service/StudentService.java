package com.cts.slap.service;

import java.util.List;

import com.cts.slap.exception.StudentLogException;
import com.cts.slap.model.Student;

public interface StudentService {
	String add(Student s) throws StudentLogException;
	boolean delete(String sid) throws StudentLogException;
	Student get(String sid) throws StudentLogException;
	List<Student> getAll() throws StudentLogException;;
	boolean update(Student s) throws StudentLogException;
	void persist()throws StudentLogException;
	

}
