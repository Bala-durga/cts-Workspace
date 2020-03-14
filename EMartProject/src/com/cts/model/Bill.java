package com.cts.model;

public class Bill {
	private String billId;
	private int quantity;
	private double gst;
	private long price;
	private long amount;
	private long discountId;
	private String itemId;
	public Bill() {
		
	}
	public Bill(String billId, int quantity, double gst, long price, long amount, long discountId, String itemId) {
		super();
		this.billId = billId;
		this.quantity = quantity;
		this.gst = gst;
		this.price = price;
		this.amount = amount;
		this.discountId = discountId;
		this.itemId = itemId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getDisId() {
		return discountId;
	}
	public void setDisId(long disId) {
		this.discountId = disId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", quantity=" + quantity + ", gst=" + gst + ", price=" + price + ", amount="
				+ amount + ", disId=" + discountId + ", itemId=" + itemId + "]";
	}
	

}
