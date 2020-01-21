package com.cts.slap.dao;

public interface IQueryMapper {
	public static final String ADD_STUDENT_QRY = 
			"INSERT INTO studentss(sid,sname,joinDate,fee) VALUES(?,?,?,?)";
	public static final String MODIFY_STUDENT_QRY = 
			"UPDATE studentss SET sname=?,fee=?,joinDate=? WHERE sid=?";
	public static final String DEL_STUDENT_QRY = 
			"DELETE FROM studentss WHERE sid=?";
	public static final String GET_ALL_STUDENT_QRY = 
			"SELECT * FROM studentss";
	public static final String GET_STUDENT_QRY = 
			"SELECT * FROM studentss WHERE sid=?";
}



