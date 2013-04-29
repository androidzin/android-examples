package br.com.androidzin.android_examples;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.actionbarsherlock.app.SherlockActivity;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void startSpinner(View button)
	{
		Intent i = new Intent(getApplicationContext(), SpinnerIconActivity.class);
		startActivity(i);
	}
	
	
	public void startRandom(View button)
	{
		Intent i = new Intent(getApplicationContext(), RandomNumberActivity.class);
		startActivity(i);
	}
}
