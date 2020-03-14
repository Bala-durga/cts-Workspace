package com.cts.model;
import java.time.LocalDateTime;

public class Transaction {
	private String buyerId;
	private String transactionId;
	private String transactionType;
	private LocalDateTime transactionTime;
	public Transaction() {
		
	}
	public Transaction(String buyyerId, String transactionId, String transactionType, LocalDateTime transactionTime) {
		super();
		this.buyerId = buyyerId;
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.transactionTime = transactionTime;
	}
	public String getBuyyerId() {
		return buyerId;
	}
	public void setBuyyerId(String buyyerId) {
		this.buyerId = buyyerId;
	}
	public String gettransactionId() {
		return transactionId;
	}
	public void settransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String gettransactionType() {
		return transactionType;
	}
	public void settransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public LocalDateTime gettransactionTime() {
		return transactionTime;
	}
	public void settransactionTime(LocalDateTime transactionTime) {
		this.transactionTime = transactionTime;
	}
	@Override
	public String toString() {
		return "Transaction [buyyerId=" + buyerId + ", transactionId=" + transactionId + ", transactionType=" + transactionType
				+ ", transactionTime=" + transactionTime + "]";
	}
	
	

}
