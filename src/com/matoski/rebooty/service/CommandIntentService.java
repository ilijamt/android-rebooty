/**
 * 
 */
package com.matoski.rebooty.service;

import com.matoski.rebooty.Constants;

import eu.chainfire.libsuperuser.Shell;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * @author Ilija Matoski (ilijamt@gmail.com)
 */
public class CommandIntentService extends IntentService {

	/**
	 * The tag used when logging with {@link Log}
	 */
	private static final String LOG_TAG = CommandIntentService.class.getName();
	
	/**
	 * Constructor
	 */
	public CommandIntentService() {
		super(LOG_TAG);
	}

	/* (non-Javadoc)
	 * @see android.app.IntentService#onHandleIntent(android.content.Intent)
	 */
	@Override
	protected void onHandleIntent(Intent intent) {
		
		final String action = intent.getAction();

		if ( action.equals(Constants.KEY_ACTION_BOOTLOADER)) {
			Shell.SU.run("reboot bootloader");
		} else if ( action.equals(Constants.KEY_ACTION_POWEROFF)) {
			Shell.SU.run("reboot -p");
		} else if ( action.equals(Constants.KEY_ACTION_REBOOT)) {
			Shell.SU.run("reboot");
		} else if ( action.equals(Constants.KEY_ACTION_RECOVERY)) {
			Shell.SU.run("reboot recovery");
		} else {
			Log.w(LOG_TAG, "Invalid action");
		}
		
	}

}
