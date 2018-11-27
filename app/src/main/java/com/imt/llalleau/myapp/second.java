package com.imt.llalleau.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    static final  String TAG = MainActivity.class.getName();

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        this.textView = (TextView)findViewById(R.id.textView);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.DATA_MESSAGE_KEY);

        this.textView.setText(message);
    }
}
