package com.cts.model;

public class SubCategory {
	private String categoryId;
	private String subcategoryId;
	private String subCategoryName;
	public SubCategory() {
		
	}
	public SubCategory(String categoryId, String subcategoryId, String subCategoryName) {
		super();
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.subCategoryName =subCategoryName;
	}
	public String getcategoryId() {
		return categoryId;
	}
	public void setcategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(String subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getsubCategoryName() {
		return subCategoryName;
	}
	public void setsubCategoryName(String subCategoryName) {
		this.subCategoryName =subCategoryName;
	}
	@Override
	public String toString() {
		return "SubCategory [categoryId=" + categoryId + ", subcategoryId=" + subcategoryId + ",subCategoryName=" +subCategoryName + "]";
	}
	

}
