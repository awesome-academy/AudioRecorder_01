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


import com.sun.audiorecorder_01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChangeLanguageFragment extends Fragment {
    private RadioButton mradio_tiengviet,mradio_english;
    private Button mbutton_confirm,mbutton_cancel;

    public ChangeLanguageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_change_language, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView();
        initClickListeners();
        super.onViewCreated(view, savedInstanceState);
    }

    private void initClickListeners() {

    }

    private void initView() {
        mradio_tiengviet=getView().findViewById(R.id.radio_tiengviet);
        mradio_tiengviet=getView().findViewById(R.id.radio_tiengviet);
        mbutton_confirm=getView().findViewById(R.id.button_confirm);
        mbutton_cancel=getView().findViewById(R.id.button_cancel);
    }
}

