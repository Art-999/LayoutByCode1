package com.example.arturmusayelyan.layoutbycode1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new MyInnerClass());
    }

    class MyInnerClass implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Log.d("Art_Log", "button was clicked");
        }
    }
}
