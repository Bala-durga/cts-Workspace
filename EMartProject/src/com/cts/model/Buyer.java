package com.cts.model;

public class Buyer {
	private String buyerName;
	private String buyerId;
	private String buyerPwd;
	private long buyerPh;
	private String buyerEmail;
	public Buyer() {
		
	}
	public Buyer(String buyerName, String buyerId, String buyerPwd, long buyerPh, String buyerEmail) {
		super();
		this.buyerName = buyerName;
		this.buyerId = buyerId;
		this.buyerPwd = buyerPwd;
		this.buyerPh = buyerPh;
		this.buyerEmail = buyerEmail;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerPwd() {
		return buyerPwd;
	}
	public void setBuyerPwd(String buyerPwd) {
		this.buyerPwd = buyerPwd;
	}
	public long getBuyerPh() {
		return buyerPh;
	}
	public void setBuyerPh(long buyerPh) {
		this.buyerPh = buyerPh;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	@Override
	public String toString() {
		return "Buyer [buyerName=" + buyerName + ", buyerId=" + buyerId + ", buyerPwd=" + buyerPwd + ", buyerPh="
				+ buyerPh + ", buyerEmail=" + buyerEmail + "]";
	}
	

}
