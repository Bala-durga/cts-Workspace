package com.cts.slap.dao;
import java.util.List;

import com.cts.slap.model.Student;
import com.cts.slap.exception.StudentLogException;

public interface StudentDAO {
	
		String add(Student s) throws StudentLogException;
		boolean delete(String sid)throws StudentLogException;
		Student get(String mcode) throws StudentLogException;;
		List<Student> getAll() throws StudentLogException;;
		boolean update(Student s) throws StudentLogException;
		void persist()throws StudentLogException;

}
