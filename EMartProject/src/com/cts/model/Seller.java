package com.cts.model;

public class Seller {
	private String sellerName;
	private String sellerId;
	private String sellerPassword;
	private String sellerEmail;
	private long sellerPhNum;
	private String sellerWebsite;
	private String disellerId;
	private String companyName;
	public Seller() {
		
	}
	public Seller(String sellerName,String sellerId, String sellerPassword, String sellerEmail, long sellerPhNum, String sellerWebsite, String disellerId,
			String companyName) {
		super();
		this.sellerId=sellerId;
		this.sellerName = sellerName;
		this.sellerPassword = sellerPassword;
		this.sellerEmail = sellerEmail;
		this.sellerPhNum = sellerPhNum;
		this.sellerWebsite = sellerWebsite;
		this.disellerId = disellerId;
		this.companyName = companyName;
	}
	public String getsellerName() {
		return sellerName;
	}
	
	public void setsellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getsellerId() {
		return sellerId;
	}
	public void setsellerId(String sellerId) {
		this.sellerId=sellerId;
	}
	public String getsellerPassword() {
		return sellerPassword;
	}
	public void setsellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}
	public String getsellerEmail() {
		return sellerEmail;
	}
	public void setsellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public long getsellerPhNum() {
		return sellerPhNum;
	}
	public void setsellerPhNum(long sellerPhNum) {
		this.sellerPhNum = sellerPhNum;
	}
	public String getsellerWebsite() {
		return sellerWebsite;
	}
	public void setsellerWebsite(String sellerWebsite) {
		this.sellerWebsite = sellerWebsite;
	}
	public String getDisellerId() {
		return disellerId;
	}
	public void setDisellerId(String disellerId) {
		this.disellerId = disellerId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Seller [sellerName=" + sellerName + ", sellerPassword=" + sellerPassword + ", sellerEmail=" + sellerEmail + ", sellerPhNum=" + sellerPhNum + ", sellerWebsite="
				+ sellerWebsite + ", disellerId=" + disellerId + ", companyName=" + companyName + "]";
	}
		
	

}
