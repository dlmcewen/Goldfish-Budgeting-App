package com.goldfish;

public class Account_Data {
	
		private String bank = "Wells Fargo";
		private String debOrCred = "Debit";
		
		public String getBank()	{
			return this.bank;
		}
		
		public void setBudgetType(String budgetType)	{
			this.bank = budgetType;
		}
		
		public void setNewBank(String newBank){
			
		}
		
		// Depricated method
		public String getdebOrCred()	{
			return this.debOrCred;
		}
		// Depricated method
		public void setNewCategory(String newCategory)	{
			this.debOrCred = newCategory;
		}
}
