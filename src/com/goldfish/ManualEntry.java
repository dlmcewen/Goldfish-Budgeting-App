package com.goldfish;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ManualEntry extends Activity {
	
	private Spinner categorySpinner;
	private List<String> spinnerCategories;
	private ArrayAdapter<String> dataAdapter;
	
	private static final int MAXIMUM_NUMBER_OF_BUDGETS = 30; 
	
	private EditText manual_entry_amount;
	private TextView amountTV;
	private BudgetData budgetData;
	private BudgetData[] budgetDataArray;
	final Context context = this;
	protected static int noOfBudgets = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manual_entry);
		
		addItemsToCategorySpinner();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.manual_entry, menu);
		return true;
	}
	
	// add items into spinner dynamically
	public void addItemsToCategorySpinner() {
		budgetData = new BudgetData();
		categorySpinner = (Spinner) findViewById(R.id.manual_entry_category_spinner);
		categorySpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		spinnerCategories = new ArrayList<String>();
		spinnerCategories.add("Food");
		spinnerCategories.add("Coffee");
		spinnerCategories.add("Gas");
		
		dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerCategories);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		categorySpinner.setAdapter(dataAdapter);
	}
	
	
	public void addListenerOnSpinnerItemSelection() {
		//categorySpinner = (Spinner) findViewById(R.id.manual_entry_category_spinner);
		//categorySpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}
	 
	
	/** Inner class to listen for the spinner */
	public class CustomOnItemSelectedListener implements OnItemSelectedListener {
		 
		public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
			//Toast.makeText(parent.getContext(), "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
		  }
				
		  @Override
		  public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
		  }
	}
	
	/** Called when the user clicks the cancel button */
	public void manual_entry_cancel(View view)	{
		
	}
	
	/** Called when the user clicks the add new category button */
	public void button_add_new_category(View view)	{
		
		// get prompts.xml view
		LayoutInflater li = LayoutInflater.from(context);
		View promptsView = li.inflate(R.layout.dialog_new_category, null);
			  
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
	
		// set prompts.xml to alertdialog builder
		alertDialogBuilder.setView(promptsView);
	 
		final EditText newCategory = (EditText) promptsView.findViewById(R.id.new_category_ET);
		 
		// set title
		alertDialogBuilder.setTitle("New Category");
	 
		// set dialog message
		alertDialogBuilder
		//.setMessage("Enter a new category")
			.setCancelable(false)
			.setPositiveButton("Add",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					// if this button is clicked, close
					// current activity
					if (newCategory.getText().toString() != null )	{
						String userInput = newCategory.getText().toString();
						budgetData.setNewCategory(userInput);
						spinnerCategories.add(spinnerCategories.size() - 1, budgetData.getCategory());
						categorySpinner.setSelection(dataAdapter.getPosition(userInput));
						categorySpinner.setSelection(dataAdapter.getPosition(userInput));
					}
					//ManualEntry.this.finish();
					dialog.cancel();
				}
			  })
			.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					// if this button is clicked, just close
					// the dialog box and do nothing
							dialog.cancel();
						}
					});
	 
		// creates alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();
	 
		// Show the dialog
		alertDialog.show();
		
	}
	
	/**  */
	public static int getbudgets()	{
		return noOfBudgets;
	}
	
	public static void increaseNoBudgets()	{
		noOfBudgets++;
	}
	
	/** Called when the user clicks the done button */
	public void manual_entry_done(View view)	{
		budgetDataArray = new BudgetData[MAXIMUM_NUMBER_OF_BUDGETS];
		
		manual_entry_amount = (EditText)findViewById(R.id.manual_entry_amount);
		String entryAmount = manual_entry_amount.getText().toString();
		
		budgetDataArray[noOfBudgets] = new BudgetData();
		
		budgetDataArray[noOfBudgets].setManualEntryAmount(entryAmount);
		budgetDataArray[noOfBudgets].setNewCategory(budgetData.getCategory());
		
		amountTV = (TextView)findViewById(R.id.amountTV);
		amountTV.setText("Amount: " + entryAmount);
		
		Toast.makeText(ManualEntry.this,"OnClickListener: " + "\nSpinner: "+ String.valueOf(categorySpinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
		
		noOfBudgets++;
		
		Intent intent = new Intent(this, Home.class);
	    startActivity(intent);
	}
	
	
}
