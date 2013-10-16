package com.goldfish;

import java.util.Calendar;

public class BudgetData {
	
<<<<<<< HEAD
		// Deprecated variable
=======
	
		private double manualEntryAmount = 0.00;
		private String budgetType = "Groceries";
		private int[] date = {Calendar.DATE, Calendar.MONTH};
		
		
		public BudgetData(){
		}

		public String getDate(){
			return this.date[0]+"/"+this.date[1];
		}
		// Depricated variable
>>>>>>> 37b35e99f341018a3f354258c274aa983ddc1d6a
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
