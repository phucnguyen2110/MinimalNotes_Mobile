package com.example.nmc.Remind.Reminder;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.nmc.Remind.AppDefault.AppDefaultActivity;
import com.example.nmc.Remind.R;

public class ReminderActivity extends AppDefaultActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int contentViewLayoutRes() {
        return R.layout.reminder_layout;
    }

    @NonNull
    @Override
    protected ReminderFragment createInitialFragment() {
        return ReminderFragment.newInstance();
    }


}
