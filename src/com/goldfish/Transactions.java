package com.goldfish;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Transactions extends Activity {
	
	private TextView transaction1;
	private TextView transaction2;
	private TextView transaction3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transactions);
		
		TransactionsData transObj1 = new TransactionsData("Walmart", "10:15", "3/21/13", 20.37, true);
		
		transaction1 = (TextView)findViewById(R.id.trans1TV);
		
		transaction1.setText (transObj1.getStore() + "		" + transObj1.getAmount());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.transactions, menu);
		return true;
	}

}
