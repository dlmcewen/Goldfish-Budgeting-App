package com.goldfish;

public class GoldFishData {

	/*
	 * Currently temp values assigned to the instance
	 * variables for asthetic testing purposes
	 */
	private int age = -1;
	private String budgetType = "Groceries";
	private String fishName = "Dr. Fishy";
	private String username = "Aegis";
	private String password = "password";
	private double budgetEntry = 0.00;
	private String budgetEntryString = "";
	
	
	public int getAge()	{
		return this.age;
	}
	
	public void setAge(int age)	{
		this.age = age;
	}
	
	public String getStringAge()	{
		return "" + age;
	}
	
	public String getBudgetType()	{
		return this.budgetType;
	}
	
	public void setBudgetType(String budgetType)	{
		this.budgetType = budgetType;
	}
	
	
	public String getFishName()	{
		return this.fishName;
	}
	
	public void setFishName(String fishName)	{
		this.fishName = fishName;
	}
	
	
	public String getUsername()	{
		return this.username;
	}
	
	public void setUsername(String username)	{
		this.username = username;
	}
	
	public double getBudgetEntry()	{
		this.budgetEntry = Double.parseDouble(budgetEntryString);
		
		return this.budgetEntry;
	}
	
	public void setBudgetEntry(double budgetEntry)	{
		this.budgetEntry = budgetEntry;
	}
	
	/*
	public String getPassword()	{
		return this.password;
	}
	
	public void setPassword(String password)	{
		this.password = password;
	}
	*/
}
