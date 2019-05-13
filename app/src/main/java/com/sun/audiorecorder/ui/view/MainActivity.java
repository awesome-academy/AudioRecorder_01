package com.sun.audiorecorder.ui.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sun.audiorecorder.ui.view.home.HomeFragment;
import com.sun.audiorecorder_01.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openHomeScreen();
    }

    public void openHomeScreen() {
        HomeFragment homeFragment = new HomeFragment();
        int fragmentManager = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_mainActitity, homeFragment)
                .addToBackStack(null)
                .commit();
    }
}
