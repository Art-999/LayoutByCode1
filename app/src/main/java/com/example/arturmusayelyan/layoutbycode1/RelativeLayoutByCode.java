package com.example.arturmusayelyan.layoutbycode1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by artur.musayelyan on 07/11/2017.
 */

public class RelativeLayoutByCode extends AppCompatActivity {
    private RelativeLayout mainLayout;
    private TextView tvMessage, tvUserName, tvPassvord;
    private EditText etUserName, etPassword;
    private Button btnLogin;
    private RelativeLayout.LayoutParams mainLayoutDimensions, tvMessageDimensions, tvUserNameDimensions, tvPasswordDimensions, etUserNameDimensions, etPasswordDimensions, btnLoginDimensions;

    private int tvMessageID = 1, tvUserNameID = 2, tvPasswordID = 3, etUserNameID = 4, etPasswordID = 5, btnLoginID = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        createTextViewMessage();
        createTextViewUserName();
        createEditTextUserName();

        mainLayout.addView(tvMessage);
        mainLayout.addView(tvUserName);
        mainLayout.addView(etUserName);

        setContentView(mainLayout);
    }

    public void init() {
        mainLayout = new RelativeLayout(this);
        mainLayoutDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mainLayout.setLayoutParams(mainLayoutDimensions);

        tvMessage = new TextView(this);
        tvUserName = new TextView(this);
        tvPassvord = new TextView(this);
        etUserName = new EditText(this);
        etPassword = new EditText(this);
        btnLogin = new Button(this);
    }

    public void createTextViewMessage() {
        tvMessageDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tvMessageDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        tvMessage.setText("Please Login First");
        tvMessage.setId(tvMessageID);
    }

    public void createTextViewUserName() {
        tvUserNameDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tvUserNameDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        tvUserNameDimensions.addRule(RelativeLayout.BELOW, tvMessageID);
        tvUserName.setText("User Name");
        tvUserName.setId(tvUserNameID);
    }
    public void createEditTextUserName(){
        etUserNameDimensions=new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        etUserNameDimensions.addRule(RelativeLayout.BELOW,tvMessageID);
        etUserNameDimensions.addRule(RelativeLayout.RIGHT_OF,tvUserNameID);
        etUserNameDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
    }
}
