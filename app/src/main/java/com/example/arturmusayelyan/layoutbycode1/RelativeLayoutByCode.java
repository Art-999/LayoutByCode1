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
    private int customMargin = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        createTextViewMessage();
        createTextViewUserName();
        createEditTextUserName();
        createTextViewPassword();
        createEditTextPassword();
        createButtonLogin();

        mainLayout.addView(tvMessage);
        mainLayout.addView(tvUserName);
        mainLayout.addView(etUserName);
        mainLayout.addView(tvPassvord);
        mainLayout.addView(etPassword);
        mainLayout.addView(btnLogin);

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
        tvMessage.setLayoutParams(tvMessageDimensions);
        tvMessage.setText("Please Login First");
        tvMessage.setId(tvMessageID);
        tvMessageDimensions.setMargins(customMargin, customMargin, customMargin, customMargin);
    }

    public void createTextViewUserName() {
        tvUserNameDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tvUserNameDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        tvUserNameDimensions.addRule(RelativeLayout.BELOW, tvMessageID);
        tvUserName.setLayoutParams(tvUserNameDimensions);
        tvUserName.setText("User Name");
        tvUserName.setId(tvUserNameID);
        tvUserNameDimensions.setMargins(customMargin, customMargin, customMargin, customMargin);
    }

    public void createEditTextUserName() {
        etUserNameDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        etUserNameDimensions.addRule(RelativeLayout.BELOW, tvMessageID);
        etUserNameDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        etUserNameDimensions.addRule(RelativeLayout.RIGHT_OF, tvUserNameID);
        etUserName.setLayoutParams(etUserNameDimensions);
        etPassword.setId(etPasswordID);
        etUserNameDimensions.addRule(RelativeLayout.ALIGN_BASELINE, tvUserNameID);
        etUserNameDimensions.setMargins(customMargin, customMargin, customMargin, customMargin);
    }

    public void createTextViewPassword() {
        tvPasswordDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tvPasswordDimensions.addRule(RelativeLayout.BELOW, tvUserNameID);
        tvPassvord.setLayoutParams(tvPasswordDimensions);
        tvPassvord.setText("Password");
        tvPassvord.setId(tvPasswordID);
        tvPasswordDimensions.setMargins(customMargin, customMargin, customMargin, customMargin);
    }

    public void createEditTextPassword() {
        etPasswordDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        etPasswordDimensions.addRule(RelativeLayout.BELOW, etUserNameID);
        etPasswordDimensions.addRule(RelativeLayout.RIGHT_OF, tvPasswordID);
        etPasswordDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        etPassword.setLayoutParams(etPasswordDimensions);
        etPassword.setId(etPasswordID);
        etPasswordDimensions.addRule(RelativeLayout.ALIGN_BASELINE, tvPasswordID);
        etPasswordDimensions.setMargins(customMargin, customMargin, customMargin, customMargin);
    }

    public void createButtonLogin() {
        btnLoginDimensions = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnLoginDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        btnLoginDimensions.addRule(RelativeLayout.BELOW, etPasswordID);
        btnLogin.setLayoutParams(btnLoginDimensions);
        btnLogin.setId(btnLoginID);
        btnLogin.setText("Login");
        btnLoginDimensions.setMargins(customMargin, customMargin, customMargin, customMargin);
    }
}
