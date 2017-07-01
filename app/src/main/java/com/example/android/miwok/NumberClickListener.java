package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by yodgorbekkomilov on 6/29/17.
 */

public class NumberClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open The List of Numbers", Toast.LENGTH_SHORT).show();
    }
}
