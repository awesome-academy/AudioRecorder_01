package com.sun.audiorecorder.ui.view.setting.language;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class LanguageSettingFragment extends Fragment {
    private RadioButton mRadioVietnamese;
    private RadioButton mRadionEglish;
    private Button mButtonConfirm;
    private Button mButtonCancel;

    public LanguageSettingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting_language, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        super.onViewCreated(view, savedInstanceState);
    }

    private void initView() {
        mRadioVietnamese = getView().findViewById(R.id.radio_vietnamese);
        mRadionEglish = getView().findViewById(R.id.radio_english);
        mButtonConfirm = getView().findViewById(R.id.button_confirm);
        mButtonCancel = getView().findViewById(R.id.button_cancel);
    }

}
