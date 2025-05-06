package com.example.mobil_12_broadcastapp_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //static final String CUSTOM_BROADCAST_ACTION = BuildConfig.APPLICATION_ID + "CUSTOM_BROADCAST_INTENT";
    static final String CUSTOM_BROADCAST_ACTION = "hu.unideb.mobil_123456789" + "CUSTOM_BROADCAST_INTENT";
    private CustomReceiver mCustomReceiver = new CustomReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public void sendCustomBroadcast(View view) {

    }
}