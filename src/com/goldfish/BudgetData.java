package com.goldfish;

public class BudgetData {
	
		private double manualEntryAmount = 0.00;
		private String budgetType = "Groceries";
		
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
