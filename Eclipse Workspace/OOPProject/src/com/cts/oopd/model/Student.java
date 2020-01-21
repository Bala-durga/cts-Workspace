package com.cts.oopd.model;

public class Student {
	private int roll;
	private String name;
	private static String course;
	private static int feePaid;
	public Student() {
	}
	public Student(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	public static void setCourse(String newCourse) {
		course=newCourse;
	}
	public static String getCourse() {
		return course;
	}
	public static void setFeePaid(int fee) {
		feePaid=fee;
	}
	public static int getFeePaid() {
		return feePaid;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void show() {
		System.out.println(roll+","+name+","+course+","+feePaid);	
	}
}
