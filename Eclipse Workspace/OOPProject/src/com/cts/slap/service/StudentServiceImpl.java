package com.cts.slap.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cts.slap.dao.StudentDAO;
import com.cts.slap.dao.StudentDAOIOStreamImpl;
import com.cts.slap.dao.StudentDAOJDBCImpl;
import com.cts.slap.exception.StudentLogException;
import com.cts.slap.model.Student;
import com.cts.slap.service.StudentServiceImpl;
import com.cts.slap.dao.StudentDAOIOStreamImpl;
public   class StudentServiceImpl implements StudentService {
	
	private StudentDAO sDao;
	
	public StudentDAO getDAO() {
		return sDao;
		
	}
	
	public StudentServiceImpl() throws StudentLogException {
		
		sDao = new StudentDAOJDBCImpl();
		
		
	}
	
	public boolean isValidSid(String sid){
		
		/*
		 * First letter must be capital
		 * Followed by three digits
		 */
		Pattern sidPattern = Pattern.compile("[A-Z]\\d{5}");
		Matcher sidMatcher = sidPattern.matcher(sid);
		
		return sidMatcher.matches();
	}
	
	public boolean isValidSname(String sname){
		/*
		 * First Letter should be capital
		 * Minimum length is 4 chars
		 * Maximum length is 15 chars.		
		 */
		Pattern snamePattern = Pattern.compile("[A-Z]\\w{3,14}");
		Matcher snameMatcher = snamePattern.matcher(sname);
		
		return snameMatcher.matches();
	}
	
	public boolean isValidFee(double fee){
		/*
		 * Price is between 5000 and 50000
		 */
		return fee>=5000 && fee<=60000;
	}
	
	public boolean isValidJoinDate(LocalDate joinDate){
		/*
		 * join date should not be greater than the current day.
		 */
		LocalDate today = LocalDate.now();
		//return joinDate.isBefore(today) || joinDate.equals(today);
		return today.isAfter(joinDate) || joinDate.equals(today);
	}
	
	public boolean isValidStudent(Student s) throws StudentLogException{
		boolean isValid=false;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(!isValidSid(s.getSid()))
			errMsgs.add("sid should start with a capital alphabet followed by 5 digits");
		
		if(!isValidSname(s.getSname()))
			errMsgs.add("Sname must start with capital and must be in between 4 to 15 chars in length");
		
		if(!isValidFee(s.getFee()))
			errMsgs.add("Fee must be between INR.5000 and INR.60000");
		
		if(!isValidJoinDate(s.getJoinDate()))
			errMsgs.add("Join Date should not be a future date");
		
		if(errMsgs.size()==0)
			isValid=true;
		else
			throw new StudentLogException(errMsgs.toString());
		
		return isValid;
	}


	@Override
	public String add(Student s) throws StudentLogException {
		String sid=null;
		if(s!=null && isValidStudent(s)){
			sid=sDao.add(s);
		}
		return sid;
	}

	@Override
	public boolean delete(String sid) throws StudentLogException {
		boolean isDone=false;
		if(sid!=null && isValidSid(sid)){
			sDao.delete(sid);
			isDone = true;
		}else{
			throw new StudentLogException("sid should be a capital letter followed by 5 digits");
		}
		return isDone;
	}

	@Override
	public Student get(String sid) throws StudentLogException {
		return sDao.get(sid);
	}

	@Override
	public List<Student> getAll() throws StudentLogException {
		return sDao.getAll();
	}

	@Override
	public boolean update(Student s) throws StudentLogException {
		boolean isDone = false;
		
		if(s!=null && isValidStudent(s)){
			isDone = sDao.update(s);
		}
		
		return isDone;
	}

	@Override
	public void persist() throws StudentLogException {
		// TODO Auto-generated method stub
		sDao.persist();
	}

}
