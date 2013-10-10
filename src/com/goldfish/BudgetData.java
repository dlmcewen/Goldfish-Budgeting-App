package com.goldfish;

public class BudgetData {
	
		private double manualEntryAmount = 0.00;
		private String newCategory = "";
		
		
		public double getManualEntryAmount()	{
			return this.manualEntryAmount;
		}
		
		public void setManualEntryAmount(double manualEntryAmount)	{
			this.manualEntryAmount = manualEntryAmount;
		}
		
		
		public String getNewCategory()	{
			return this.newCategory;
		}
		
		public void setNewCategory(String newCategory)	{
			this.newCategory = newCategory;
		}
}
