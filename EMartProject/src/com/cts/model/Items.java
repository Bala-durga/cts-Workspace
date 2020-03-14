package com.cts.model;

import java.time.LocalDateTime;

public class Items {
	private String itemName;
	private String itemId;
	private String sellerId;
	private String subCategoryId;
	private long itemPrice;
	private LocalDateTime itemUpdateDate;
	private int itemStock;
	public Items() {
		
	}
	public Items(String itemName, String itemId, String sellerId, String subCategoryId, long itemPrice, LocalDateTime itemUpdateDate,int itemStock) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
		this.sellerId = sellerId;
		this.subCategoryId = subCategoryId;
		this.itemPrice = itemPrice;
		this.itemUpdateDate=itemUpdateDate;
		this.itemStock=itemStock;
	
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getsellerId() {
		return sellerId;
	}
	public void setsellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getsubCategoryId() {
		return subCategoryId;
	}
	public void setsubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public long getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(long itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public LocalDateTime getItemUpdateDate() {
		return itemUpdateDate;
	}
	public void setItemUpdateDate(LocalDateTime itemUpdateDate) {
		this.itemUpdateDate = itemUpdateDate;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	@Override
	public String toString() {
		return "Items [itemName=" + itemName + ", itemId=" + itemId + ", sellerId=" + sellerId + ", subCategoryId=" + subCategoryId
				+ ", itemPrice=" + itemPrice + ", itemStock=" +itemStock+ ",itemUpdateDate"+itemUpdateDate+"]";
	
	}
	
	

}
