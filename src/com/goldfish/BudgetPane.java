package com.goldfish;

import java.util.Scanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class BudgetPane extends Activity{
	private Budget[] budgetArray = new Budget[30];
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_budget);
	
	
		
		int length = budgetArray.length;
		LinearLayout layout = new LinearLayout(this);
		setContentView(layout);
		layout.setOrientation(LinearLayout.VERTICAL);
		for(int i=0;i<length;i++){
			Button b = new Button(getApplicationContext());
			b.setText(budgetArray[i].getName());
			layout.addView(b);
		}
		
		
	}
	
	
	public void addBudget(View v){
		
		
	}
	
	public void transactions(View v){
		
	}
	
	public void accounts(View v){
		
	}
	
	
	Scanner fish = new Scanner();
	
	
	
}
