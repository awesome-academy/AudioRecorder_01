package com.sun.audiorecorder.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.sun.audiorecorder_01.R;

public class ChangeBackgroud extends Fragment implements View.OnClickListener {
    private RadioButton mRadioButtonRadio_color_Black, mRadioButtonRadio_color_blue, mRadioButtonRadio_color_Red;
    private Button mButtonConfirm, mButtonCancel;
    private Button mButtonListAudioRecorver, mButtonPlay, mButtonStop;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_change_backgroud, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        initClickListeners();
        super.onViewCreated(view, savedInstanceState);
    }

    private void initClickListeners() {
        mButtonConfirm.setOnClickListener(this);
        mButtonCancel.setOnClickListener(this);
        mButtonListAudioRecorver.setOnClickListener(this);
        mButtonPlay.setOnClickListener(this);
        mButtonStop.setOnClickListener(this);
    }

    private void initView() {
//        mRadioButtonRadio_color_Black = getView().findViewById(R.id.radio_color_Black);
//        mRadioButtonRadio_color_blue = getView().findViewById(R.id.radio_color_blue);
//        mRadioButtonRadio_color_Red = getView().findViewById(R.id.radio_color_Red);
//        mButtonConfirm = getView().findViewById(R.id.button_confirm);
//        mButtonCancel = getView().findViewById(R.id.button_cancel);

        mButtonListAudioRecorver = getView().findViewById(R.id.imagebutton_ListAudioRecover);
        mButtonPlay = getView().findViewById(R.id.imagebutton_play);
        mButtonStop = getView().findViewById(R.id.imagebutton_stop);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_confirm:
                ConfirmChangeBackground();
                break;
            case R.id.button_cancel:
                CancelChangeBackgroud();
                break;
        }
    }

    private void CancelChangeBackgroud() {

    }

    private void ConfirmChangeBackground() {
        String text = "";
        if (mRadioButtonRadio_color_Black.isChecked()) {
            Toast.makeText(getActivity(), text + mRadioButtonRadio_color_Black.getText().toString(), Toast.LENGTH_SHORT).show();
        } else if (mRadioButtonRadio_color_Red.isChecked()) {
            Toast.makeText(getActivity(), text + mRadioButtonRadio_color_Red.getText().toString(), Toast.LENGTH_SHORT).show();
        } else if (mRadioButtonRadio_color_blue.isChecked()) {
            Toast.makeText(getActivity(), text + mRadioButtonRadio_color_blue.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
