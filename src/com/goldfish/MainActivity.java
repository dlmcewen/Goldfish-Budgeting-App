package com.goldfish;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private static final int PROGRESS = 0x1;

    private ProgressBar mProgress;
    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setUpBudgetsButton();
        mProgress = (ProgressBar) findViewById(R.id.progressBar1);

        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus < 100) {
                   // mProgressStatus = doWork();

                    // Update the progress bar
                    mHandler.post(new Runnable() {
                        public void run() {
                            mProgress.setProgress(mProgressStatus);
                        }
                    });
                }
            }
        }).start();
		
	}

	private void setUpBudgetsButton() {
		Button budgetsButton = (Button) findViewById(R.id.button_budgets);
		
		budgetsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				
				//Toast.makeText(MainActivity.this, "Clickity Clack, down the track!", Toast.LENGTH_LONG).show();
				
				startActivity(new Intent(MainActivity.this, AccountScreen.class));
			}
		});
	}

	

}
