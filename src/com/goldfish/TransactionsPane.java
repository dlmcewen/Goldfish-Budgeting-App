package com.goldfish;

import android.os.Bundle;
import android.view.Menu;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class TransactionsPane {
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transactions);
	
	
		
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

	
	
	
	
}
