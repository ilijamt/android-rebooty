/**
 * 
 */
package com.matoski.rebooty.activity;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Ilija Matoski (ilijamt@gmail.com)
 * 
 */
public abstract class BlankActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		finish();
	}

}