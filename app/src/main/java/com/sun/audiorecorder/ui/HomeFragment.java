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
import android.widget.RadioButton;

import com.sun.audiorecorder_01.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private AlertDialog.Builder mbuilder;
 //   private ChangeBackgroud mChangeBackgroud;
    private ImageButton mImageButtonListAudioRecover, mImageButtonPlay, mImageButtonStop;
    private OpenListAudioRecorverFragmentCallback mOpenListAudioRecorverFragmentCallback;
    protected boolean check=true;
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
        initView();
        initClickListeners();
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof OpenListAudioRecorverFragmentCallback) {
            mOpenListAudioRecorverFragmentCallback = (OpenListAudioRecorverFragmentCallback) getActivity();
        }
    }

    private void initClickListeners() {
        mImageButtonListAudioRecover.setOnClickListener(this);
        mImageButtonPlay.setOnClickListener(this);
        mImageButtonStop.setOnClickListener(this);
    }

    private void initView() {
        mImageButtonListAudioRecover = getView().findViewById(R.id.imagebutton_ListAudioRecover);
        mImageButtonPlay = getView().findViewById(R.id.imagebutton_play);
        mImageButtonStop = getView().findViewById(R.id.imagebutton_stop);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imagebutton_ListAudioRecover:
                mOpenListAudioRecorverFragmentCallback.OpenListAudioRecorverFragmentCallback();
                break;
            case R.id.imagebutton_play:
                initEventClickListeners();
                break;
            case R.id.imagebutton_stop:
                mOpenListAudioRecorverFragmentCallback.OpenListAudioRecorverFragmentCallback();
                break;
        }
    }

    private void initEventClickListeners() {
        if (check) {
            check=false;
            mImageButtonPlay.setBackgroundResource(R.drawable.btn_pause);
        } else {
            check=true;
            mImageButtonPlay.setBackgroundResource(R.drawable.btn_play);
        }
    }

    private void initDiaLogChangeBackgroundListeners() {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.homefragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_Change_Language:
                OpenDiaLogChangeLanguage();
                break;
            case R.id.item_Change_Background:
                OpenDiaLogChangeBackground();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void OpenDiaLogChangeBackground() {
        mbuilder = new AlertDialog.Builder(getActivity());
        View view = getLayoutInflater().inflate(R.layout.fragment_change_backgroud, null);
        mbuilder.setView(view);
        mbuilder.create();
        mbuilder.show();
        initDiaLogChangeBackgroundListeners();
    }

    private void OpenDiaLogChangeLanguage() {
        mbuilder = new AlertDialog.Builder(getActivity());
        View view = getLayoutInflater().inflate(R.layout.fragment_change_language, null);
        mbuilder.setView(view);
        mbuilder.create();
        mbuilder.show();
    }



    public interface OpenListAudioRecorverFragmentCallback {
        void OpenListAudioRecorverFragmentCallback();
    }

}
