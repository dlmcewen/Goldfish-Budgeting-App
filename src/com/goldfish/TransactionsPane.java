package com.goldfish;

<<<<<<< HEAD
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TransactionsPane extends Activity {
	BudgetData[] budgetinformation = new BudgetData[100];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transactions);
		
		
		
		 int length = budgetinformation.length;
         LinearLayout layout = new LinearLayout(this);
         setContentView(layout);
         layout.setOrientation(LinearLayout.VERTICAL);
         for(int i=0;i<length;i++){
                 TextView tv = new TextView(getApplicationContext());
                 tv.setText(budgetinformation[i].getDate()+"   "+budgetinformation[i].getBudgetType()+"  " + budgetinformation[i].getManualEntryAmount());
                 layout.addView(tv);
         }
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.transactions_pane, menu);
		return true;
	}

=======
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

	
	
	
	
>>>>>>> 37b35e99f341018a3f354258c274aa983ddc1d6a
}
