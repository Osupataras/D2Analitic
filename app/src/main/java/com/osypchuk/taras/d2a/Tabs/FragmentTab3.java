package com.osypchuk.taras.d2a.Tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.osypchuk.taras.d2a.R;

/**
 * Created by Taras on 26.11.2016.
 */

public class FragmentTab3 extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_match_list, container, false);
    }
}