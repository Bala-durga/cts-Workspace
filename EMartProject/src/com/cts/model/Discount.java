package com.cts.model;

import java.time.LocalDate;

public class Discount {
	private String discountId;
	private String discountCode;
	private LocalDate startDate;
	private LocalDate endDate;
	public Discount() {
		
	}
	public Discount(String discountId, String discountCode, LocalDate startDate, LocalDate endDate) {
		super();
		this.discountId = discountId;
		this.discountCode = discountCode;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getdiscountId() {
		return discountId;
	}
	public void setdiscountId(String discountId) {
		this.discountId = discountId;
	}
	public String getdiscountCode() {
		return discountCode;
	}
	public void setdiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", discountCode=" + discountCode + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
	
}
