package com.osypchuk.taras.d2a.Tabs;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.osypchuk.taras.d2a.Interfaces.OnFragmentInteractionListener;
import com.osypchuk.taras.d2a.R;

/**
 * Created by Taras on 26.11.2016.
 */

public class FragmentTab1 extends android.support.v4.app.Fragment {

    OnFragmentInteractionListener mListener;

    public FragmentTab1() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tab_account_id, container, false);
        Button comfirmBtn = (Button) view.findViewById(R.id.comfbtn);
        comfirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) getActivity().findViewById(R.id.account_name);
                TextView textView = (TextView) getActivity().findViewById(R.id.acc);
                Toast.makeText(getActivity(), editText.getText(), Toast.LENGTH_LONG).show();
                textView.setText(editText.getText());
                hideKeyboardFrom(getContext(),view);

            }
        });
        return view;

    }
    public static void hideKeyboardFrom(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
