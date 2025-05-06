package com.example.mobil_12_broadcastapp_01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        if (intentAction!=null){
            String toastString = "Unknown action...";
            switch (intentAction){
                case Intent.ACTION_POWER_CONNECTED: toastString="Connected";break;
                case Intent.ACTION_POWER_DISCONNECTED: toastString="Disconnected";break;
                case MainActivity.CUSTOM_BROADCAST_ACTION: toastString=" - - - C U S T O M - - - ";break;
            }
            Toast.makeText(context, toastString, Toast.LENGTH_SHORT).show();
        }
    }
}
