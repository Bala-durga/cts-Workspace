package com.cts.model;

public class Category {
	private String categoryId;
	private String categoryName;
	private double gst;
	public Category() {
	}
	public Category(String categoryId, String categoryName, double gst) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.gst = gst;
	}
	public String getcategoryId() {
		return categoryId;
	}
	public void setcategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getcategoryName() {
		return categoryName;
	}
	public void setcategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", gst=" + gst + "]";
	}
}
	
