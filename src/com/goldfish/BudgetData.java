package com.goldfish;

import java.util.Calendar;

public class BudgetData {
	
		// Deprecated variable
		private String newCategory = "";
	
		private static double entryAmount = 0.00;
		private static double manualEntryAmount = 0.00;
		private int[] date = {Calendar.DATE, Calendar.MONTH};
		
		private static String budgetType = "Groceries";
		
		
		public BudgetData()	{
        
		}
		
		public String getDate(){
            return this.date[0]+"/"+this.date[1];
		}
		
		public double getEntryAmount()	{
			return BudgetData.entryAmount;
		}
		
		public double getManualEntryAmount()	{
			return BudgetData.manualEntryAmount;
		}
		
		public void setManualEntryAmount(String entryAmount)	{
			BudgetData.entryAmount = Double.parseDouble(entryAmount);
		}
		
		public void setManualEntryAmount(double entryAmount)	{
			BudgetData.entryAmount = entryAmount;
		}
		
		public String getBudgetType()	{
			return BudgetData.budgetType;
		}
		
		public void setBudgetType(String budgetType)	{
			BudgetData.budgetType = budgetType;
		}
		
		
		// Deprecated method
		public String getCategory()	{
			return this.newCategory;
		}
		// Deprecated method
		public void setNewCategory(String newCategory)	{
			this.newCategory = newCategory;
		}
}
