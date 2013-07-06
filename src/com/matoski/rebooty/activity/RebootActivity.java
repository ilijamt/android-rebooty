/*
 * Copyright 2013 Ilija Matoski (ilijamt@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
public class RebootActivity extends BaseActivity {

	/* (non-Javadoc)
	 * @see com.matoski.rebooty.activity.BaseActivity#dialogClickedYes()
	 */
	@Override
	protected void dialogClickedYes() {
		final Intent intent = new Intent(getBaseContext(), CommandIntentService.class);
		intent.setAction(Constants.KEY_ACTION_REBOOT);
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

		this.dialogTitle = R.string.reboot;
		this.dialogMessage = R.string.reboot_message;
		
	}

}
