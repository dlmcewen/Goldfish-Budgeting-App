package com.goldfish;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class AccountScreen extends Activity {
	
	private Spinner accSpinner;
	private List<String> spinnerCategories;
	private ArrayAdapter<String> dataAdapter;
	private String accountNum;
	private TextView accNumView;
	
	final Context context = this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_account_screen);
		setUpDoneButton();
		setUpCancelButton();
		addItemsToAccSpinner();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.account_screen, menu);
		return true;
	}
	
	public void addItemsToAccSpinner() {
		accSpinner = (Spinner) findViewById(R.id.spinner1);
		accNumView = (TextView) findViewById(R.id.textView3);
		spinnerCategories = new ArrayList<String>();
		spinnerCategories.add("Bank of America   Debit");
		spinnerCategories.add("Capital One       Debit");
		
		dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerCategories);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		accSpinner.setAdapter(dataAdapter);
	}
	
	public void addListenerOnSpinnerItemSelection() {
		//categorySpinner = (Spinner) findViewById(R.id.manual_entry_category_spinner);
		//categorySpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}
	 
	
	/** Inner class to listen for the spinner */
	public class CustomOnItemSelectedListener implements OnItemSelectedListener {
		 
		public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
			//Toast.makeText(parent.getContext(), "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
			
		if (String.valueOf(accSpinner.getSelectedItem()) == "Bank of America   Debit")	{
			
			accountNum = "************2390";
			
		}
		
		if (String.valueOf(accSpinner.getSelectedItem()) == "Capital One       Debit") {
			
			accountNum = "************4672";
		}
	 
		accNumView.setText(accountNum);
		
		  }
				
		  @Override
		  public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
		  }
	}

	private void setUpDoneButton() {
		Button doneButton = (Button) findViewById(R.id.button3);
		
		doneButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				
				//Toast.makeText(MainActivity.this, "Clickity Clack, down the track!", Toast.LENGTH_LONG).show();
				
				startActivity(new Intent(AccountScreen.this, MainActivity.class));
			}
		});
	}
	
	private void setUpCancelButton() {
		Button doneButton = (Button) findViewById(R.id.button2);
		
		doneButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				
				//Toast.makeText(MainActivity.this, "Clickity Clack, down the track!", Toast.LENGTH_LONG).show();
				
				startActivity(new Intent(AccountScreen.this, MainActivity.class));
			}
		});
	}
}
