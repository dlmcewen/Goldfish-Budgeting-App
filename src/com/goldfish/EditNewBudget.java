package com.goldfish;

import android.app.Activity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
 
public class EditNewBudget extends Activity {
 
    private TextView sDateDisplay;
    private TextView eDateDisplay;
    private int sYear;
    private int sMonth;
    private int sDay;
    private int eYear;
    private int eMonth;
    private int eDay;   
    static final int SDATE_DIALOG_ID = 1;
    static final int EDATE_DIALOG_ID = 2;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_new_budget);
        sDateDisplay = (TextView) findViewById(R.id.startDateDisplay);
        Button sPickDate = (Button) findViewById(R.id.pickStartDate);
        sPickDate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDialog(SDATE_DIALOG_ID);
            }
        });
        final Calendar sC = Calendar.getInstance();
        sYear = sC.get(Calendar.YEAR);
        sMonth = sC.get(Calendar.MONTH);
        sDay = sC.get(Calendar.DAY_OF_MONTH);
        updateStartDisplay();
        eDateDisplay = (TextView)findViewById(R.id.endDateDisplay);
        Button ePickDate = (Button) findViewById(R.id.pickEndDate);
        ePickDate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDialog(EDATE_DIALOG_ID);
            }
        });
        final Calendar eC = Calendar.getInstance();
        eYear = eC.get(Calendar.YEAR);
        eMonth = eC.get(Calendar.MONTH);
        eDay = eC.get(Calendar.DAY_OF_MONTH);
        updateEndDisplay();
        
//        addItemsOnAlertSpinner();
    }
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
 
        case SDATE_DIALOG_ID:
            return new DatePickerDialog(this,
                sDateSetListener,
                sYear, sMonth, sDay);
            
        case EDATE_DIALOG_ID:
        	return new DatePickerDialog(this,
        		eDateSetListener,
        		eYear, eMonth, eDay);
        }
        return null;
    }
    protected void onPrepareDialog(int id, Dialog dialog) {
        switch (id) {
 
        case SDATE_DIALOG_ID:
            ((DatePickerDialog) dialog).updateDate(sYear, sMonth, sDay);
            break;
            
        case EDATE_DIALOG_ID:
        	((DatePickerDialog) dialog).updateDate(eYear, eMonth, eDay);
        	break;
        }
    }    
    private void updateStartDisplay() {
        sDateDisplay.setText(
            new StringBuilder()
            // Month is 0 based so add 1
            .append(sMonth + 1).append("-")
            .append(sDay).append("-")
            .append(sYear).append(" "));
    };
    
    private void updateEndDisplay(){
        eDateDisplay.setText(
        	new StringBuilder()
        	.append(eMonth + 1).append("-")
            .append(eDay).append("-")
            .append(eYear).append(" "));
    }
    private DatePickerDialog.OnDateSetListener sDateSetListener =
        new DatePickerDialog.OnDateSetListener() {
 
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                int dayOfMonth) {
            sYear = year;
            sMonth = monthOfYear;
            sDay = dayOfMonth;
            updateStartDisplay();
        }
    };
    
    private DatePickerDialog.OnDateSetListener eDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
     
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                    int dayOfMonth) {
                eYear = year;
                eMonth = monthOfYear;
                eDay = dayOfMonth;
                updateEndDisplay();
            }
        };
  
}