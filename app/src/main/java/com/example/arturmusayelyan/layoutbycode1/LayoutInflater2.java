package com.example.arturmusayelyan.layoutbycode1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.LinearLayout;

public class LayoutInflater2 extends AppCompatActivity {
    private LinearLayout linearLayout;
    private android.view.LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater2);
        linearLayout = (LinearLayout) findViewById(R.id.liner_layout);
        inflater=getLayoutInflater();

        View view=inflater.inflate(R.layout.sublayout,linearLayout,false);
        linearLayout.addView(view,new LinearLayout.LayoutParams(100,100));
        View view1=inflater.inflate(R.layout.sublayout2,linearLayout,false);
        linearLayout.addView(view1,new LinearLayout.LayoutParams(100,100));
    }
}
