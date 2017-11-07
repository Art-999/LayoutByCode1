package com.example.arturmusayelyan.layoutbycode1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinerLayoutByCode extends AppCompatActivity {
    private LinearLayout mainLayout;
    private TextView firstTextView;
    private Button firstButton;
    private LinearLayout.LayoutParams mainLayoutDimensions, firstTextViewDimensions, firstButtonDimensions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainLayout = new LinearLayout(this);
        firstTextView = new TextView(this);
        firstButton = new Button(this);

        mainLayoutDimensions = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mainLayout.setLayoutParams(mainLayoutDimensions);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        firstTextViewDimensions = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        firstTextView.setLayoutParams(firstTextViewDimensions);
        firstTextView.setText("Hello World");

        firstButtonDimensions = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        firstButton.setLayoutParams(firstButtonDimensions);
        firstButton.setText("Button");

        mainLayout.addView(firstTextView);
        mainLayout.addView(firstButton);

        setContentView(mainLayout);
    }
}
