package com.goldfish;

import java.util.ArrayList;
import java.util.Calendar;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Settings extends Activity {
	
	private EditText setFishName, setDays;
	private TextView date;
	private GoldFishData goldFishData;
	private Calendar calendar;
	private Budget budget;
	
	private Spinner categorySpinner;
	private List<String> spinnerCategories;
	private ArrayAdapter<String> dataAdapter;
	private BudgetData budgetData;
	final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		addItemsToCategorySpinner();
		
		budget = new Budget();
		budgetData = new BudgetData();
		
		date = (TextView)findViewById(R.id.date);

		calendar = Calendar.getInstance();
	    budget.setMonth(calendar.get(Calendar.MONTH));
	    budget.setDay(calendar.get(Calendar.DAY_OF_MONTH));
	    budget.setYear(calendar.get(Calendar.YEAR));

	    // set current date into textview
	    date.setText(new StringBuilder().append(budget.getMonth() + 1).append("/").append(budget.getDay()).append("/").append(budget.getYear()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
	
	// add items into spinner dynamically
		public void addItemsToCategorySpinner() {
			categorySpinner = (Spinner) findViewById(R.id.settings_category_spinner);
			categorySpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
			spinnerCategories = new ArrayList<String>();
			spinnerCategories.add("Food");
			spinnerCategories.add("Coffee");
			spinnerCategories.add("Gas");
			
			dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerCategories);
			dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			categorySpinner.setAdapter(dataAdapter);
		}
	
		
		/** Inner class to listen for the spinner */
		public class CustomOnItemSelectedListener implements OnItemSelectedListener {
			 
			public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
				//Toast.makeText(parent.getContext(), "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
				budgetData.setBudgetType(String.valueOf(categorySpinner.getSelectedItem()));
			}
					
			  @Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			}
		}
	
	
	/*
		if (String.valueOf(categorySpinner.getSelectedItem()) == "New Category")	{
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
	 
					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();
	 
				// show it
				alertDialog.show();
			  }
			  */
	
	/** Called when the user clicks the set date button */
	public void datePickerButton(View view)	{
		
	}
	
	/** Called when the user clicks the new category button */
	public void settings_new_category(View view)	{
		
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
						spinnerCategories.add(spinnerCategories.size(), budgetData.getCategory());
						categorySpinner.setSelection(dataAdapter.getPosition(userInput));
						categorySpinner.setSelection(dataAdapter.getPosition(userInput));
					}
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
		
	/** Called when the user clicks the done button */
	public void done_setValues(View view)	{
		goldFishData = new GoldFishData();
		
		setFishName = (EditText)findViewById(R.id.setFishName);
		setDays = (EditText)findViewById(R.id.setDays);
		
		String setFishNameTemp = setFishName.getText().toString();
		String setDaysTemp = setDays.getText().toString();
		
		if (setFishNameTemp != null)	{
			goldFishData.setFishName(setFishNameTemp);
		}
			
		if (setDaysTemp != null)	{
			goldFishData.setAge(setDaysTemp);
		}
		
		Intent intent = new Intent(this, Home.class);
	    startActivity(intent);
	}
}
