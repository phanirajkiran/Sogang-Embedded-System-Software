package com.example.androidex;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ProcActivity extends Activity{
	LinearLayout linear;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proc);
		linear = (LinearLayout)findViewById(R.id.container);
	}
}