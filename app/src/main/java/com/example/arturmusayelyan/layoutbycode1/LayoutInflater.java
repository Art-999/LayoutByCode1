package com.example.arturmusayelyan.layoutbycode1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class LayoutInflater extends AppCompatActivity {
    LinearLayout parentLayout;
    RelativeLayout childLayout;
    android.view.LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater);
        parentLayout = (LinearLayout) findViewById(R.id.layout_parent);
        childLayout = (RelativeLayout) findViewById(R.id.layout_child);

        inflater = getLayoutInflater();
//        View view = inflater.inflate(R.layout.sublayout, null);
//        view.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        childLayout.addView(view);

        //  View view = inflater.inflate(R.layout.sublayout, childLayout);

//        View view = inflater.inflate(R.layout.sublayout, childLayout, false);
//        view.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        childLayout.addView(view);

        View view = inflater.inflate(R.layout.sublayout, childLayout, false);
    }
}
