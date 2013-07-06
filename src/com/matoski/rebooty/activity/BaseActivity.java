/**
 * 
 */
package com.matoski.rebooty.activity;

import com.matoski.rebooty.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * @author Ilija Matoski (ilijamt@gmail.com)
 * 
 */
public abstract class BaseActivity extends Activity {

	/** The dialog click listener. */
	DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which) {
			switch (which) {
				case DialogInterface.BUTTON_POSITIVE:
					dialogClickedYes();
					break;

				case DialogInterface.BUTTON_NEGATIVE:
					dialogClickedNo();
					break;
			}
			finish();
		}
	};

	/**
	 * Callback if we click Yes on the dialog
	 */
	protected abstract void dialogClickedYes();

	/**
	 * Callback if we click No on the dialog
	 */
	protected abstract void dialogClickedNo();

	/**
	 * Setup the string for the Dialog in the Activity
	 */
	protected abstract void setupStrings();

	protected Integer dialogMessage = null;
	protected Integer dialogTitle = null;

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setupStrings();

		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setMessage(dialogMessage).setTitle(dialogTitle);

		builder.setPositiveButton(R.string.yes, dialogClickListener);
		builder.setNegativeButton(R.string.no, dialogClickListener);

		AlertDialog dialog = builder.create();
		dialog.show();

	}

}