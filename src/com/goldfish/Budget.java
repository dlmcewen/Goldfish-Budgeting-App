package com.goldfish;

import java.util.Calendar;

public class Budget {
	int d,m,y;
    int budgetAmount;
    String budgetName;
    
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
