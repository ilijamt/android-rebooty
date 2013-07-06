/**
 * 
 */
package com.matoski.rebooty.activity;

import android.content.Intent;

import com.matoski.rebooty.Constants;
import com.matoski.rebooty.R;
import com.matoski.rebooty.service.CommandIntentService;

/**
 * @author Ilija Matoski (ilijamt@gmail.com)
 *
 */
public class RebootRecoveryActivity extends BaseActivity {

	/* (non-Javadoc)
	 * @see com.matoski.rebooty.activity.BaseActivity#dialogClickedYes()
	 */
	@Override
	protected void dialogClickedYes() {
		final Intent intent = new Intent(getBaseContext(), CommandIntentService.class);
		intent.setAction(Constants.KEY_ACTION_RECOVERY);
		startService(intent);		
	}

	/* (non-Javadoc)
	 * @see com.matoski.rebooty.activity.BaseActivity#dialogClickedNo()
	 */
	@Override
	protected void dialogClickedNo() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.matoski.rebooty.activity.BaseActivity#setupStrings()
	 */
	@Override
	protected void setupStrings() {

		this.dialogTitle = R.string.reboot_recovery;
		this.dialogMessage = R.string.reboot_recovery_message;
		
	}

}
