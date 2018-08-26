package com.example.student.bootreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by student on 26.04.2018.
 */

public class SomeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "SOME received", Toast.LENGTH_SHORT).show();
    }
}
