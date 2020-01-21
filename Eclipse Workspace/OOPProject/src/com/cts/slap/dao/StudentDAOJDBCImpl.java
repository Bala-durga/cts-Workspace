package com.cts.slap.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.slap.exception.StudentLogException;
import com.cts.slap.model.Student;
import com.cts.slap.dao.StudentDAOJDBCImpl;
	

public class StudentDAOJDBCImpl  implements StudentDAO {
	
	    private Map<String, Student> stu;
		
		    public StudentDAOJDBCImpl() {
			stu = new TreeMap<>();
		} 
		    
		@Override

		public String add(Student s) throws StudentLogException {
			String sid = null;
			if (s != null) {
				sid= s.getSid();
				stu.put(sid, s);	
			}
			return sid;
		}
			

		@Override
		public boolean delete(String sid) throws StudentLogException {
			boolean isDone = false;
			if (sid != null) {
				stu.remove(sid);
				isDone = true;
			}
			return isDone;
			
		}

		@Override
		public Student get(String sid) throws StudentLogException {
			return stu.get(sid);
			
		}	
			

		@Override
		public List<Student> getAll() throws StudentLogException {
			return new ArrayList<>(stu.values());
		}

		public boolean update(Student s) throws StudentLogException {
			boolean isDone = false;
			if (s != null) {
				String sid = s.getSid();
				stu.replace(sid, s);
				
			}
			return isDone;
			
		}

		@Override
		public void persist() throws StudentLogException {
			// TODO Auto-generated method stub
			
		}


	}


