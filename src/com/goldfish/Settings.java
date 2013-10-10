package com.goldfish;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Settings extends Activity {
	
	private EditText fishNameSet;
	private GoldFishData goldFishData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
	
	/** Called when the user clicks the set button */
	public void setValues(View view)	{
		goldFishData = new GoldFishData();
		fishNameSet = (EditText)findViewById(R.id.fishNameSet);
		
		goldFishData.setFishName(fishNameSet.getText().toString());
		
	}

}
