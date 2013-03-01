package com.example.samplemaxbutton;

import com.tableObject.samplemaxbutton.MaxButton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	//Button 1
	private MaxButton button_1;
	//Button 2
	private MaxButton button_2;
	// Label
	private TextView mTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//get view button
		button_1 = (MaxButton) findViewById(R.id.button_1);
		button_2 = (MaxButton) findViewById(R.id.button_2);
		button_1.setOnClickListener(this);
		button_2.setOnClickListener(this);
		
		//change opacity
		button_2.setOpacityDown(0.3f);
		button_1.setOpacityDown(0.5f);
		
		//get Label
		mTextView = (TextView)findViewById(R.id.helleWorld);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * 
	 */
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_1:
			mTextView.setText("Button_1");
			break;
		case R.id.button_2:
			mTextView.setText("Button_2");
			break;
		default:
			break;
		}
	}

}
