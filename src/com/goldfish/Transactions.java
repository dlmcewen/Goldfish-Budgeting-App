package com.goldfish;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Transactions extends Activity {
	
	TransactionsData initialTransaction = new TransactionsData("Walmart", "10:15", "3/21/13", 20.37, true);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transactions);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.transactions, menu);
		return true;
	}

}
