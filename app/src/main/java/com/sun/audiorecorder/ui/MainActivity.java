package com.sun.audiorecorder.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sun.audiorecorder_01.R;

public class MainActivity extends AppCompatActivity implements HomeFragment.OpenListAudioRecorverFragmentCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OpenHomeFragmentCallback();
    }

    @Override
    public void OpenListAudioRecorverFragmentCallback() {
        ListAudioRecorverFragment listAudioRecorverFragment = new ListAudioRecorverFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frag_main, listAudioRecorverFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    public void OpenHomeFragmentCallback() {
        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frag_main, homeFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
