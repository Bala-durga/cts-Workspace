package com.cts.model;

public class Order {
	private String buyerId;
	private String orderId;
	private String billId;
	private double gross;
	private String orderStatus;
	public Order() {
		
	}
	public Order(String buyerId, String orderId, String billId, double gross, String orderStatus) {
		super();
		this.buyerId = buyerId;
		this.orderId = orderId;
		this.billId = billId;
		this.gross = gross;
		this.orderStatus = orderStatus;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "Order [buyerId=" + buyerId + ", orderId=" + orderId + ", billId=" + billId + ", gross=" + gross
				+ ", orderStatus=" + orderStatus + "]";
	}
	
	

}
