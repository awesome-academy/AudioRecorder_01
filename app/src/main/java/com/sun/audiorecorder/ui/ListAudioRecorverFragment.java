package com.sun.audiorecorder.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sun.audiorecorder_01.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListAudioRecorverFragment extends Fragment {


    public ListAudioRecorverFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_listaudiorecorver, container, false);
    }
}
