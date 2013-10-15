package com.goldfish;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class TransactionsPane extends Activity{
	BudgetData[] budgetinformation = new BudgetData[100];
	
	
	
	

	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transactions);
	
	
		
		int length = budgetinformation.length;
		LinearLayout layout = new LinearLayout(this);
		setContentView(layout);
		layout.setOrientation(LinearLayout.VERTICAL);
		for(int i=0;i<length;i++){
			TextView tv = new TextView(getApplicationContext());
			tv.setText(budgetinformation[i].getDate()+"   "+budgetinformation[i].getBudgetType()+"  "+budgetinformation[i].getManualEntryAmount());
			layout.addView(tv);
		}
		
	}

	
	
	
	
}
