package com.goldfish;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ManualEntry extends Activity {
	
	private Spinner spinner;
	private List<String> spinnerCategories;
	private ArrayAdapter<String> dataAdapter;
	
	private EditText manual_entry_amount;
	private BudgetData budgetData;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manual_entry);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.manual_entry, menu);
		return true;
	}
	
	/** Inner class to handle the category spinner */
	public class AndroidSpinnerActivity extends Activity implements OnItemSelectedListener{
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_fullscreen);

	        // Spinner element
	        spinner = (Spinner) findViewById(R.id.manual_entry_category_spinner);

	        // Spinner click listener
	        spinner.setOnItemSelectedListener(this);

	        // Spinner Drop down elements
	        spinnerCategories = new ArrayList<String>();

	        spinnerCategories.add("Food & Drink");
	        spinnerCategories.add("Groceries");
	        spinnerCategories.add("Clothing");
	        spinnerCategories.add("Other");

	        // Creating adapter for spinner
	        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerCategories);

	        // Drop down layout style - list view with radio button
	        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

	        // attaching data adapter to spinner
	        spinner.setAdapter(dataAdapter);
	    }

	    @Override
	    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
	        // On selecting a spinner item
	        String item = parent.getItemAtPosition(position).toString();

	        // Showing selected spinner item
	        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
	    }

	    public void onNothingSelected(AdapterView<?> arg0) {
	        // TODO Auto-generated method stub
	    }

	}
	
	/** Called when the user clicks the cancel button */
	public void manual_entry_cancel(View view)	{
		
	}
	
	/** Called when the user clicks the done button */
	public void manual_entry_done(View view)	{
		
	}
	
	/** Called when the user clicks the add button (under new category) */
	public void manual_entry_submit_new_category(View view)	{
		
		manual_entry_amount = (EditText)findViewById(R.id.manual_entry_amount);
		String temp = manual_entry_amount.getText().toString();
		
		//spinnerCategories.add(temp);
		// add to adapter;
		
		// Notifies the Adapter to update the spinner
		dataAdapter.notifyDataSetChanged();
	}
	
}
