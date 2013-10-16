package com.goldfish;

import java.util.Calendar;

public class Budget {
	int d,m,y;
    float budgetAmount;
    String budgetName;
    float waterLevelRatio;
    float currentAmount;
    String[] tags;
    boolean isActive = false;
    
    public Budget(){
        budgetName = "";
        budgetAmount  = 0;
        d = Calendar.DATE;
        m = Calendar.MONTH;
        y = Calendar.YEAR;
        
    }
    public Budget(String nameOfBudget, int amt, int day, int month, int year, String[] items){
        budgetName = nameOfBudget;
        budgetAmount = amt;
        d = Calendar.DATE;
        m = Calendar.MONTH;
        y = Calendar.YEAR;
        for(int i=0;i<items.length;i++){
        	this.tags[i] = items[i];
        }
        isActive = true;
        
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
    
    public String getName(){
        return budgetName;
    }
    public float getAmount(){
        return budgetAmount;
    }
    public void lessBudget(int amountRemoved){
        budgetAmount = budgetAmount - amountRemoved;
    }
    public void setDay(int day){
    	this.d = day;
    }
    public void setMonth(int month){
    	this.m = month;
    }
    public void setYear(int year){
    	this.y = year;
    }
    public void setBudgetAmount(float amt){
    	this.budgetAmount = amt;
    }
    public void setBudgetAmount(String name){
    	this.budgetName = name;
    }
    //Returns the ratio of the the current amount in the budget to the budget starting amount
    public void getLevel(){
    	float r = this.currentAmount/this.budgetAmount;
    	this.waterLevelRatio = r;
    }
    public String[] getTag(){
    	return this.tags;
    }
    public void setTag(String[] x){
    	this.tags = x;
    }
    
    
    
	
	
	
}
