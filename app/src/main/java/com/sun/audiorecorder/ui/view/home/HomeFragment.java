package com.sun.audiorecorder.ui.view.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


import com.sun.audiorecorder_01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private AlertDialog.Builder mbuilder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.homefragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuSettingLanguage:
                openDiaLogSetting(R.layout.fragment_change_language);
                break;
            case R.id.menuSettingBackground:
                openDiaLogSetting(R.layout.fragment_change_backgroud);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openDiaLogSetting(int layoutId) {
        mbuilder = new AlertDialog.Builder(getActivity());
        View view = getLayoutInflater().inflate(layoutId, null);
        mbuilder.setView(view);
        mbuilder.create();
        mbuilder.show();
    }
}
