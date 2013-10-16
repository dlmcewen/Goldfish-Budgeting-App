package com.goldfish;

public class TransactionsData {
	
	TransactionsData(String storeI, String timeI, String dateI, double amountI, boolean isActiveI){
		
		storeName = storeI;
		time = timeI;
		date = dateI;
		amount = amountI;
		isActive = isActiveI;
		
	}
	
	private String storeName = "";
	private String time = "";
	private String date = "";
	private double amount = 0.00;
	private boolean isActive = false;
	
	
	
	public String getStore()	{
		return this.storeName;
	}
	
	public void setStore(String store)	{
		this.storeName = store;
	}
	
	public String getTime()	{
		return this.time;
	}
	
	public void setTime(String givenTime){
		this.time = givenTime;
	}
	
	public String getDate()	{
		return this.date;
	}
	
	public void setDate(String givenDate) {
		this.date = givenDate;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	public void setAmount(double amountSpent)	{
		this.amount = amountSpent;
	}
	
	public boolean isActive()	{
		return this.isActive;
	}
	
	public void setPassword(boolean activate)	{
		this.isActive = activate;
	}

}
