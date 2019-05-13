package com.sun.audiorecorder.ui.view.setting.backgroud;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.sun.audiorecorder_01.R;

public class BackgroudSettingFragmnet extends Fragment {
    private RadioButton mRadioBlack;
    private RadioButton mRadioBlue;
    private RadioButton mRadioRed;
    private Button mButtonConfirm;
    private Button mButtonCancel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_setting_backgroud, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        super.onViewCreated(view, savedInstanceState);
    }

    private void initView() {
        mRadioBlack = getView().findViewById(R.id.radio_color_black);
        mRadioBlue = getView().findViewById(R.id.radio_color_blue);
        mRadioRed = getView().findViewById(R.id.radio_color_red);
        mButtonConfirm = getView().findViewById(R.id.button_confirm);
        mButtonCancel = getView().findViewById(R.id.button_cancel);
    }
}
