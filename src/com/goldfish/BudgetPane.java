package com.goldfish;

import java.util.Scanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class BudgetPane extends Activity{
	private Budget[] budgetArray = new Budget[6];
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_budget);
	
		
	
		
		
		
		
		
	}
	
	
	public void addBudget(View v){
		
		
	}
	
	public void transactions(View v){
		Intent intent = new Intent(this, TransactionsPane.class);
	    startActivity(intent);
	}
	
	public void accounts(View v){
		
	}
	
		
	
	
}
