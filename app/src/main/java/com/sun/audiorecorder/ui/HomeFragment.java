package com.sun.audiorecorder.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.sun.audiorecorder_01.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private AlertDialog.Builder mbuilder;
    private static HomeFragment sInstance;

    public static synchronized HomeFragment getInstance() {
        if (sInstance == null) {
            sInstance = new HomeFragment();
        }
        return sInstance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.homefragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_Change_Language:
                openDiaLogChangeLanguage();
                break;
            case R.id.item_Change_Background:
                openDiaLogChangeBackground();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openDiaLogChangeBackground() {
        mbuilder = new AlertDialog.Builder(getActivity());
        View view = getLayoutInflater().inflate(R.layout.fragment_change_backgroud, null);
        mbuilder.setView(view);
        mbuilder.create();
        mbuilder.show();
    }

    private void openDiaLogChangeLanguage() {
        mbuilder = new AlertDialog.Builder(getActivity());
        View view = getLayoutInflater().inflate(R.layout.fragment_change_language, null);
        mbuilder.setView(view);
        mbuilder.create();
        mbuilder.show();
    }

}

