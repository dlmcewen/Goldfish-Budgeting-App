package com.goldfish;

public class GoldFishData {

	/*
	 * Currently temp values assigned to the instance
	 * variables for asthetic testing purposes
	 */
	
	private static int age = 6;
	private static String fishName = "Dr. Fishy";
	private String username = "Aegis";
	private String password = "password";
	private double budgetEntry = 0.00;
	private String budgetEntryString = "";
	
	// Deprecated variable
	private String budgetType = "Groceries";
	
	
	public int getAge()	{
		return GoldFishData.age;
	}
	
	public void setAge(String age)	{
		GoldFishData.age = Integer.parseInt(age);
	}
	
	public void setAge(int age)	{
		GoldFishData.age = age;
	}
	
	public String getStringAge()	{
		return "" + age;
	}
	
	
	// Deprecated Method
	public String getBudgetType()	{
		return this.budgetType;
	}
	
	// Deprecated method
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
	
	public void setPassword(String oldPassword, String newPassword, String retypeNewPassword)	{
		int errorCode;
	
		if (oldPassword.equals(this.password))	{
			
			this.password = newPassword;
		
		}
	}
	*/
}
