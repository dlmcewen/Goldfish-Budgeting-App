package com.goldfish;

import java.util.Calendar;

public class BudgetData {
	
	
		private double manualEntryAmount = 0.00;
		private String budgetType = "Groceries";
		private int[] date = {Calendar.DATE, Calendar.MONTH};
		
		
		public BudgetData(){
		}

		public String getDate(){
			return this.date[0]+"/"+this.date[1];
		}
		// Depricated variable
		private String newCategory = "";
		
		
		
		public double getManualEntryAmount()	{
			return this.manualEntryAmount;
		}
		
		public void setManualEntryAmount(double manualEntryAmount)	{
			this.manualEntryAmount = manualEntryAmount;
		}
		
		public String getBudgetType()	{
			return this.budgetType;
		}
		
		public void setBudgetType(String budgetType)	{
			this.budgetType = budgetType;
		}
		
		
		// Depricated method
		public String getCategory()	{
			return this.newCategory;
		}
		// Depricated method
		public void setNewCategory(String newCategory)	{
			this.newCategory = newCategory;
		}
}
