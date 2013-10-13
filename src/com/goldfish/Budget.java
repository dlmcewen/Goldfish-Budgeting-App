package com.goldfish;

import java.util.Calendar;

public class Budget {
	private int d,m,y;
    private int budgetAmount;
    private String budgetName;
    
    public Budget(){
        budgetName = "";
        budgetAmount  = 0;
        d = Calendar.DATE;
        m = Calendar.MONTH;
        y = Calendar.YEAR;
        
    }
    public Budget(String nameOfBudget, int amt, int day, int month, int year){
        budgetName = nameOfBudget;
        budgetAmount = amt;
        d = Calendar.DATE;
        m = Calendar.MONTH;
        y = Calendar.YEAR;
        
    }
    
    public int getDay(){
        return d;
    }
    public int getMonth(){
        return m;
    }
    public int getYear(){
        return y;
    }
    
    
    public void setDay(int day)	{
    	this.d = day;
    }
    
    public void setMonth(int month)	{
    	this.m = month;
    }
    
    public void setYear(int year)	{
    	this.y = year;
    }
    
    public String getName(){
        return budgetName;
    }
    public float getAmount(){
        return budgetAmount;
    }
    public void lessBudget(int amountRemoved){
        budgetAmount = budgetAmount - amountRemoved;
    }
    

	
	
	
}
